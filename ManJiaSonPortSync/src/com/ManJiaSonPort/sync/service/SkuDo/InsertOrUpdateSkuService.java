package com.ManJiaSonPort.sync.service.SkuDo;
import com.ManJiaSonPort.sync.dao.InsertSkusDao;
import com.ManJiaSonPort.sync.dto.HishopSkus;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * Created by hanhan on 2017/6/17.
 */
@Component
public class InsertOrUpdateSkuService {
    @Autowired
    InsertSkusDao insertSkusDao;
    public void insertOrUpdate(String skuJsonString){
        List<HishopSkus> skusList = JSON.parseArray(skuJsonString, HishopSkus.class);
        insertOrUpdate(skusList);
    }
    public void insertOrUpdate(List<HishopSkus> skuList){
        for (HishopSkus hishopSkus:skuList){
            if(insertSkusDao.ifExsitByguid(hishopSkus.getGuid())){//exsit
                insertSkusDao.update(hishopSkus);
            }else{//no exsit
                insertSkusDao.insert(hishopSkus, hishopSkus.getGuid());

            }
        }
    }

}
