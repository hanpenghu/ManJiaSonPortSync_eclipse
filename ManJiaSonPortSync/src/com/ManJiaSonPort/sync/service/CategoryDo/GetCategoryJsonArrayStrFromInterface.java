package com.ManJiaSonPort.sync.service.CategoryDo;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ManJiaSonPort.sync.AbstractAll;
import com.ManJiaSonPort.sync.utils.HttpHanHan;
import com.ManJiaSonPort.sync.utils.MD5Utils;
import com.ManJiaSonPort.sync.utils.SpringUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.util.FileUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import java.io.File;

/**
 * Created by Administrator on 2017/6/15.
 */
@Component
public class GetCategoryJsonArrayStrFromInterface extends AbstractAll {
    private Logger log= LogManager.getLogger(this.getClass().getName());

/////////////////////////////////////////////////////////////////////////
    public GetCategoryJsonArrayStrFromInterface() {
        //调用父类构造初始化
       super();
    }
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    public String getCategoryJsonArrayStrFromInterface() {
        try {
            String strUrl="http://"+mothersIpAndPort+"/category/getAllCategory";
            Map params=new HashMap();
            params.put("key",key);

            String requestMethod="getAllCategory";
            String formatDate=new SimpleDateFormat("yyyy_MM_dd").format(new Date());
            String validate = MD5Utils.generatePassword(requestMethod+formatDate+key+secret);

            params.put("validate",validate);
            String sendMethod="POST";
            String categoryJsonArrayStr = HttpHanHan.net(strUrl, params, sendMethod);
            return categoryJsonArrayStr;
        } catch (Exception e) {
            log.error("获取母站分类表异常-----------------");
        }
        return null;
    }
/////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////
}
