package com.ManJiaSonPort.sync.service.CategoryDo;

import com.ManJiaSonPort.sync.dao.InsertCategoryDao;
import com.ManJiaSonPort.sync.dto.HishopCategories;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */
@Component
public class InsertCategoryService {
    @Autowired
    private InsertCategoryDao insertCategoryDao;
/////////////////////////////////////////////////////////////////////////
    public void insertOrUpdateCategory(String categoryJsonString){
        List<HishopCategories> hishopCategories = JSON.parseArray(categoryJsonString, HishopCategories.class);
        insertOrUpdateCategory(hishopCategories);
    }
/////////////////////////////////////////////////////////////////////////
    public void insertOrUpdateCategory(List<HishopCategories> hcs)  {
        for(HishopCategories hc:hcs){
            //存在
            if(insertCategoryDao.ifExsitByguid(hc)){
                insertCategoryDao.updateCategory(hc);
            }else{//不存在
                insertCategoryDao.insertCategory(hc);
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////
}
/////////////////////////////////////////////////////////////////////////