package com.ManJiaSonPort.sync.utils;

/**
 * Created by Administrator on 2017/6/15.
 */
public class PathUtils {
    /**
     *得到src所在路径
     * */
    public static String getSrcPath(Class clazz){

        return clazz.getResource("/").getPath();

    }
}
