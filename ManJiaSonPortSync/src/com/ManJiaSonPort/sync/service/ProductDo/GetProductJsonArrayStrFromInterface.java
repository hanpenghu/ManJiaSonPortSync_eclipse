package com.ManJiaSonPort.sync.service.ProductDo;

import com.ManJiaSonPort.sync.AbstractAll;
import com.ManJiaSonPort.sync.utils.HttpHanHan;
import com.ManJiaSonPort.sync.utils.MD5Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/15.
 */
@Component
public class GetProductJsonArrayStrFromInterface extends AbstractAll {
    private Logger log= LogManager.getLogger(this.getClass().getName());


    public GetProductJsonArrayStrFromInterface() {
        //调用父类构造初始化
       super();
    }



    public String getProductJsonArrayStrFromInterface(String jsonArrayOfGuids) {
        try {
            String strUrl="http://"+mothersIpAndPort+"/product/getSomeProducts";
            Map params=new HashMap();
            params.put("key",key);

            String requestMethod="getSomeProducts";
            String formatDate=new SimpleDateFormat("yyyy_MM_dd").format(new Date());
            String validate = MD5Utils.generatePassword(requestMethod+formatDate+key+secret);

            params.put("validate",validate);

            params.put("jsonArrayOfGuids",jsonArrayOfGuids);
            String sendMethod="POST";
            String productJsonArrayStr = HttpHanHan.net(strUrl, params, sendMethod);
            return productJsonArrayStr;
        } catch (Exception e) {
            log.error("获取母站商品异常-----------------");
        }
        return null;
    }




    public String getAllGuid(){
        try {
            String strUrl="http://"+mothersIpAndPort+"/product/getAllGuidOfHishopProducts";
            Map params=new HashMap();
            params.put("key",key);

            String requestMethod="getAllGuidOfHishopProducts";
            String formatDate=new SimpleDateFormat("yyyy_MM_dd").format(new Date());
            String validate = MD5Utils.generatePassword(requestMethod+formatDate+key+secret);

            params.put("validate",validate);
            String sendMethod="POST";
            String guidJsonArrayStr = HttpHanHan.net(strUrl, params, sendMethod);
            return guidJsonArrayStr;
        } catch (Exception e) {

            log.error("获得所有guid异常！！");
        }
        return null;
    }















}
