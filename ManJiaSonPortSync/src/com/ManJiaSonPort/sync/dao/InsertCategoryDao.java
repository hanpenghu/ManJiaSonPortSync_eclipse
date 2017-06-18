package com.ManJiaSonPort.sync.dao;

import com.ManJiaSonPort.sync.dao.mapperJava.HishopCategoriesMapper;
import com.ManJiaSonPort.sync.dto.HishopCategories;
import com.ManJiaSonPort.sync.dto.HishopCategoriesExample;
import com.ManJiaSonPort.sync.dto.HishopCategoriesWithBLOBs;
import com.ManJiaSonPort.sync.utils.NotEmpty;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Administrator on 2017/6/15.
 */
@Component
public class InsertCategoryDao {
    private Logger log= LogManager.getLogger(this.getClass().getName());
    @Autowired
    HishopCategoriesMapper hishopCategoriesMapper;
    /////////////////////////////////////////////////////////////////////////
    //dao层只管插入,其他复杂逻辑在service层
    public void insertCategory(HishopCategories hc)  {
        try {
            HishopCategoriesWithBLOBs hcw=new HishopCategoriesWithBLOBs();
            BeanUtils.copyProperties(hcw,hc);
            hishopCategoriesMapper.insert(hcw);
        } catch (Exception e) {
            log.error("插入分类表的时候,BeanUtils.copyProperties(hcw,hc)有可能复制对象出错！");
        }
    }
    /////////////////////////////////////////////////////////////////////////
    //存在(用guid判断)的时候启用update
    public void updateCategory(HishopCategories hc){
        HishopCategoriesExample hce=new HishopCategoriesExample();
        hce.createCriteria().andGuidEqualTo(hc.getGuid());
        hishopCategoriesMapper.updateByExample(hc,hce);
    }
/////////////////////////////////////////////////////////////////////////
    public Boolean ifExsitByguid(HishopCategories hc){
        String guid = hc.getGuid();
        if(!NotEmpty.notEmpty(guid)){
            return false;
        }
        if(hishopCategoriesMapper.countThisGuid(guid)>0){
            return true;
        }
        return false;
    }
    /////////////////////////////////////////////////////////////////////////
}
