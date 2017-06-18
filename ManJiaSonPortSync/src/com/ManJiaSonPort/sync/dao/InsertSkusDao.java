package com.ManJiaSonPort.sync.dao;

import com.ManJiaSonPort.sync.dao.mapperJava.HishopProductsMapper;
import com.ManJiaSonPort.sync.dao.mapperJava.HishopSkusMapper;
import com.ManJiaSonPort.sync.dto.HishopProducts;
import com.ManJiaSonPort.sync.dto.HishopProductsExample;
import com.ManJiaSonPort.sync.dto.HishopSkus;
import com.ManJiaSonPort.sync.dto.HishopSkusExample;
import com.ManJiaSonPort.sync.utils.NotEmpty;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Component
public class InsertSkusDao {
    private Logger log= LogManager.getLogger(this.getClass().getName());
    @Autowired
    HishopSkusMapper hishopSkusMapper;
    @Autowired
    HishopProductsMapper hishopProductsMapper;
    public void insert(HishopSkus hss,String currGuid){
        try {
            //注意插入skus之前,必须保证product该条已经插入,因为productID和skuid来自商品表
            //就是说字母站的productId和skuid是不一样的,这是自增长决定的,而自增长字段guid就是为了解决这个唯一性
            //才弄进来的
            HishopProductsExample hpe=new HishopProductsExample();
            hpe.createCriteria().andGuidEqualTo(currGuid);
            //其实只有 一个//找到刚刚插入的那条数据产生的自增长主键
            //这里用了一个技巧,就在商品表刚刚插入数据后,就处理sku表,从而把刚生成的Proudid放入规格表
            List<HishopProducts> hp = hishopProductsMapper.selectByExample(hpe);
            Integer productid = hp.get(0).getProductid();
            hss.setProductid(productid);
            hss.setSkuid(productid+"_0");
            hishopSkusMapper.insert(hss);
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+",规格表插入商品异常---------------");
            log.info("规格表插入商品异常---------------");
        }
    }





    public void update(HishopSkus hss){
        //注意:updateByExample中我吧sql中已经去掉了productid和skuid,因为
        //不需要跟母站一样,因为productid来自商品表并且自增长
        try {
            HishopSkusExample hse=new HishopSkusExample();
            hse.createCriteria().andGuidEqualTo(hss.getGuid());
            hishopSkusMapper.updateByExample(hss,hse);
        } catch (Exception e) {
            System.out.println(this.getClass().getName()+",规格表更新商品异常---------------");
            log.info("");
        }
    }






    public Boolean ifExsitByguid(String guid){
        if(!NotEmpty.notEmpty(guid)){
            return false;
        }
        if(hishopSkusMapper.countThisGuid(guid)>0){
            return true;
        }
        return false;
    }








}
