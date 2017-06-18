package com.ManJiaSonPort.sync.service.SkuDo;
import com.ManJiaSonPort.sync.AbstractAll;
import com.ManJiaSonPort.sync.service.ProductDo.GetProductJsonArrayStrFromInterface;
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
 * Created by Administrator on 2017/6/17.
 */
@Component
public class DoInsertOrUpdateSku extends AbstractAll {
    private Logger log= LogManager.getLogger(this.getClass().getName());
    @Autowired
    GetProductJsonArrayStrFromInterface getProductJsonArrayStrFromInterface;
    @Autowired
    GetSkuJsonArrayStrFromInterface getSkuJsonArrayStrFromInterface;
    @Autowired
    InsertOrUpdateSkuService insertOrUpdateSkuService;




    public void doit(){
        try {
            int n=this.perCountOfGetFromGuidList;
            System.out.println("开始");
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

                String skuJsonArr= getSkuJsonArrayStrFromInterface
                        .getSkuJsonArrayStrFromInterface(jsonGuidStr);
                insertOrUpdateSkuService.insertOrUpdate(skuJsonArr);
                guidss.removeAll(guids);
            }



            System.out.println("结束");
        } catch (Exception e) {
            System.out.println("  异常");
            log.error("定时任务同步规格表出错！！");
        }
    }


    public static void main(String[]args){
        String []configs={"classpath*:applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        System.out.println(ctx+"---------------------");
        DoInsertOrUpdateSku bean = SpringUtil.getBean(DoInsertOrUpdateSku.class);
        bean.doit();
    }



















}
