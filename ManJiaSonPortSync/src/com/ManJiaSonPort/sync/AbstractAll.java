package com.ManJiaSonPort.sync;

import com.ManJiaSonPort.sync.service.CategoryDo.GetCategoryJsonArrayStrFromInterface;
import com.ManJiaSonPort.sync.utils.PathUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2017/6/15.
 */
public abstract class  AbstractAll {
    private Logger log= LogManager.getLogger(this.getClass().getName());
    public String mothersIpAndPort="127.0.0.1:8080";
    public String key="key1";
    public String secret="secret1";
    public int perCountOfGetFromGuidList=50;
    public AbstractAll() {
        try {
            String rootPath= PathUtils.getSrcPath(AbstractAll.class);
            Properties pro=new Properties();
            pro.load(new FileReader(rootPath+"dataSource.properties"));
            this.mothersIpAndPort= pro.getProperty("mothersIpAndPort");
            this.secret=pro.getProperty("secret");
            this.key=pro.getProperty("key");
           this.perCountOfGetFromGuidList=Integer.parseInt(pro.getProperty("perCountOfGetFromGuidList"));
        } catch (IOException e) {
            log.error("读取dataSource.properties失败！！---------------");
        }
    }
}
