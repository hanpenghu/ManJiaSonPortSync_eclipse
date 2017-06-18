package com.ManJiaSonPort.sync.dao;

import com.ManJiaSonPort.sync.dao.mapperJava.HishopProductsMapper;
import com.ManJiaSonPort.sync.dto.HishopCategories;
import com.ManJiaSonPort.sync.dto.HishopProducts;
import com.ManJiaSonPort.sync.dto.HishopProductsExample;
import com.ManJiaSonPort.sync.dto.HishopProductsWithBLOBs;
import com.ManJiaSonPort.sync.utils.NotEmpty;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2017/6/16.
 */
@Component
public class InsertProductsDao {
    private Logger log= LogManager.getLogger(this.getClass().getName());
    @Autowired
    HishopProductsMapper hishopProductsMapper;
    /////////////////////////////////////////////////////////////////////////
    public void insert(HishopProductsWithBLOBs hpwb){
        log.info("商品表插入一条数据开始");
        //因为productId是自增长,所以我在sqlmapper中将该字段删去,处理办法是让
        //数据库自动生成,但是在插入sku表的时候从product表中选取该productId字段
        hpwb.setAddeddate(new Date());
        hpwb.setUpdatedate(new Date());
        hpwb.setVisticounts(0);
        hpwb.setSalecounts(0);
        hpwb.setShowsalecounts(0);
        hishopProductsMapper.insert(hpwb);
        log.info("商品表插入一条数据结束");
    }
    /////////////////////////////////////////////////////////////////////////
    public void update(HishopProductsWithBLOBs hpwb){
        try {
            System.out.println("商品表更新一条数据开始");
            HishopProductsExample hpe=new HishopProductsExample();
            hpe.createCriteria().andGuidEqualTo(hpwb.getGuid());
            hpwb.setUpdatedate(new Date());
            hishopProductsMapper.updateByExampleWithBLOBs(hpwb,hpe);
            System.out.println("商品表更新一条数据结束");
        } catch (Exception e) {
            log.info("商品表更新一条数据时候异常");
            System.out.println("商品表更新一条数据时候异常");
        }
    }
    /////////////////////////////////////////////////////////////////////////
    public Boolean ifExsitByguid(HishopProductsWithBLOBs hpwb){
        String guid = hpwb.getGuid();
        if(!NotEmpty.notEmpty(guid)){
            return false;
        }
        if(hishopProductsMapper.countThisGuid(guid)>0){
            return true;
        }
        return false;
    }
    /////////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////////////////