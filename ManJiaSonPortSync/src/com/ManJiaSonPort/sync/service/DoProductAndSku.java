package com.ManJiaSonPort.sync.service;

import com.ManJiaSonPort.sync.service.CategoryDo.DoInsertOrUpdateCategoryUseJsonStr;
import com.ManJiaSonPort.sync.service.ProductDo.DoInsertOrUpdateProdtct;
import com.ManJiaSonPort.sync.service.SkuDo.DoInsertOrUpdateSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hanhan on 2017/6/17.
 */
@Component
public class DoProductAndSku {
    @Autowired
    DoInsertOrUpdateProdtct doInsertOrUpdateProdtct;
    @Autowired
    DoInsertOrUpdateSku doInsertOrUpdateSku;
    public void doAll(){
        doInsertOrUpdateProdtct.doit();
        doInsertOrUpdateSku.doit();
    }
}
