---注意,在母站的商品表中的guid和商品规格表中的guid是对应相等的,但是他们跟分类表中的guid是不等的
--原来同步中粮是先同步完商品表再同步规格表,这边主站对子站也不例外
----满嘉主站修改,商品表,规格表,分类表,增加2个字段,TenantID代表那个站点的
----guid代表该商品全球唯一标识
--修改分类表
------------------------------=========================!!!!!!!!!!
alter table Hishop_Categories add TenantID int default 1-----母站设为0---子站不能设为0,设为其他
go
alter table Hishop_Categories add guid varchar(40) default NEWID()----字母都这样做
go
----初始化上面加的2个字段的值
------------------------------=========================!!!!!!!!!!
update Hishop_Categories set TenantID=1---此为满嘉主站代号,设为0(0代表满嘉主站)
go
update Hishop_Categories set guid=NEWID()----设置分类全球唯一标识符
go
-----------------------------------------------------------------------------------------
---修改满嘉商品表
------------------------------=========================!!!!!!!!!!
alter table Hishop_Products add TenantID int default 1     ---1是某个子站的代号
GO
alter table Hishop_Products add guid varchar(40) default NEWID()
GO
----初始化上面加的2个字段的值
------------------------------=========================!!!!!!!!!!
update Hishop_Products set TenantID=1---此为满嘉主站代号,设为0(0代表满嘉主站)
GO
update Hishop_Products set guid=NEWID()----设置分类全球唯一标识符
GO
-----------------------------------------------------------------------------------------
-----修改商品规格表，该表有点特殊,必须在该表对应的productid对应的guid跟商品表一样
------------------------------=========================!!!!!!!!!!
alter table Hishop_SKUs add TenantID int default 1
GO
alter table Hishop_SKUs add guid varchar(40) default NULL---这个弄成null是因为将来存储和触发器会自动从商品表取值,这个null可以区分没有取值的
GO
------------------------------=========================!!!!!!!!!!
update Hishop_SKUs set TenantID=1---此为满嘉zi站代号,设为1(0代表满嘉主站)
GO
-----规格表必须跟商品表的唯一标识符guid相同,用存储实现(把商品表productid对应到guid迁移到规格表中)
CREATE PROCEDURE make_Hishop_SKUs_Hishop_Products_have_same_guid
  as
	declare @i int
	select ProductId into #TABLE from Hishop_SKUs
BEGIN
    while ((select COUNT(ProductId)from #TABLE)>0)
      BEGIN
        SET @i=(SELECT top(1) ProductId from #TABLE)
        UPDATE Hishop_SKUs  SET guid=(select guid from Hishop_Products where ProductId=@i) where ProductId=@i
        delete from #TABLE where ProductId=@i
      end
END
go
---执行上面存储过程
EXECUTE make_Hishop_SKUs_Hishop_Products_have_same_guid
go
------------------------------------------------------------------------------------------------
---创建触发器,当规格表中增加一条数据的时候,对规格表中的guid自动赋值,该guid来自对应product表的guid
----主站点tenantID(站点区分字段) 为0,guid(商品全球唯一标识)必须跟商品表保持一致,(该触发器主要是为了吧原来的规格表中的guid替换成商品表的guid)
Create Trigger insert_guid_from_Hishop_Products_to_Hishop_SKUs
On Hishop_SKUs
after insert
As
declare @ProductId int
Select @ProductId=ProductId from inserted
begin
     update Hishop_SKUs set guid=(select guid FROM Hishop_Products where ProductId=@ProductId)where ProductId=@ProductId
end

GO
