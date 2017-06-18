package com.ManJiaSonPort.sync.service.ProductDo;
import com.ManJiaSonPort.sync.dao.InsertProductsDao;
import com.ManJiaSonPort.sync.dto.HishopProductsWithBLOBs;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by hanhan on 2017/6/16.
 *
 * 决定让商品表现同步,然后再同步规格表,这是为了在网络一次http的时候能拿到尽量多的信息,不至于多次http
 *
 */
@Component
public class InsertProductService {
    @Autowired
    InsertProductsDao insertProductsDao;

    public void insertOrUpdate(String ProductWithBlobJsonString){
        List<HishopProductsWithBLOBs> HishopProductsWithBLOBsList = JSON.parseArray(ProductWithBlobJsonString, HishopProductsWithBLOBs.class);
        insertOrUpdate(HishopProductsWithBLOBsList);
    }
    public void insertOrUpdate(List<HishopProductsWithBLOBs> HishopProductsWithBLOBsList){
        for(HishopProductsWithBLOBs hpb:HishopProductsWithBLOBsList){
            if(insertProductsDao.ifExsitByguid(hpb)){//存在
                insertProductsDao.update(hpb);
            }else{
                //不存在
                insertProductsDao.insert(hpb);
            }
        }
    }







}
