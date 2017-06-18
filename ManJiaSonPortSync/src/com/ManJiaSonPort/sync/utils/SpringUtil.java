package com.ManJiaSonPort.sync.utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by lu on 2016/12/7.
 */
@Lazy(false)
@Component
public class SpringUtil implements ApplicationContextAware {

    private static Logger logger = LoggerFactory.getLogger(SpringUtil.class);

    private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringUtil.applicationContext = applicationContext;
        logger.info("spring工具类初始化成功...");
    }

    public static <T> T getBean(Class<T> t){
        return applicationContext.getBean(t);
    }

    public static String getApplicatonName(){
        return applicationContext.getApplicationName();
    }

    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
}
