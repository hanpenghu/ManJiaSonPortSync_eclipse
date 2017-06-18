package com.ManJiaSonPort.sync.service.ProductDo;

import com.ManJiaSonPort.sync.AbstractAll;
import com.ManJiaSonPort.sync.utils.SpringUtil;
import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/16.
 */
@Component
public class DoInsertOrUpdateProdtct extends AbstractAll{

    private Logger log= LogManager.getLogger(this.getClass().getName());
    @Autowired
    GetProductJsonArrayStrFromInterface getProductJsonArrayStrFromInterface;

    @Autowired
    InsertProductService insertProductService;

    public DoInsertOrUpdateProdtct() {
        super();
    }

    public void doit(){
        log.info("开始插入商品表---------");
        try {
            int n=this.perCountOfGetFromGuidList;

            String allGuid = getProductJsonArrayStrFromInterface.getAllGuid();

            List<String> guidss = JSON.parseArray(allGuid, String.class);

            int sizes=guidss.size();
            int i;
            if(sizes%n==0){
                i=sizes/n;
            }else{
                i=sizes/n+1;
            }

            for(int k=0;k<i;k++){
                List<String> guids=new ArrayList<String>();
                if(guidss.size()>=n){
                    guids=guidss.subList(0,n);
                }else{
                    guids=guidss.subList(0,guidss.size());

                }

                String jsonGuidStr = JSON.toJSONString(guids);

                String productJsonArr= getProductJsonArrayStrFromInterface
                        .getProductJsonArrayStrFromInterface(jsonGuidStr);
                insertProductService.insertOrUpdate(productJsonArr);
                guidss.removeAll(guids);
            }



            log.info("结束插入商品表---------");
        } catch (Exception e) {
            System.out.println("  异常");
            log.error("定时任务同步商品表出错！！");
        }
    }






    public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
        DoInsertOrUpdateProdtct bean = SpringUtil.getBean(DoInsertOrUpdateProdtct.class);
        bean.doit();
    }









}
