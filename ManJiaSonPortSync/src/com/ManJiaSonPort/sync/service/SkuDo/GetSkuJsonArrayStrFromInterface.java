package com.ManJiaSonPort.sync.service.SkuDo;

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
public class GetSkuJsonArrayStrFromInterface extends AbstractAll {
    private Logger log= LogManager.getLogger(this.getClass().getName());


    public GetSkuJsonArrayStrFromInterface() {
        //调用父类构造初始化
       super();
    }



    public String getSkuJsonArrayStrFromInterface(String jsonArrayOfGuids) {
        try {
            String strUrl="http://"+mothersIpAndPort+"/skus/getSomeSkus";
            Map params=new HashMap();
            params.put("key",key);

            String requestMethod="getSomeSkus";
            String formatDate=new SimpleDateFormat("yyyy_MM_dd").format(new Date());
            String validate = MD5Utils.generatePassword(requestMethod+formatDate+key+secret);

            params.put("validate",validate);

            params.put("jsonArrayOfGuids",jsonArrayOfGuids);
            String sendMethod="POST";
            String skuJsonArrayStr = HttpHanHan.net(strUrl, params, sendMethod);
            return skuJsonArrayStr;
        } catch (Exception e) {
            log.error("获取母站商品规格异常-----------------");
        }
        return null;
    }


















}
