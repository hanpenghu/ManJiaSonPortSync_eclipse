package com.ManJiaSonPort.sync.utils;
import java.io.*;

/**
 * Created by Administrator on 2017/6/9.
 */
public class ReadTxt {
    public static String readAllTxt(String txtPath){
        File file=null; FileReader fr=null;BufferedReader br=null;
        try {
            file=new File(txtPath);
            fr=new FileReader(file);
            br=new BufferedReader(fr);
            StringBuffer sb=new StringBuffer();
            String str="";
            while((str=br.readLine())!=null){
                sb.append(str);
            }
            return sb.toString().trim();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                fr.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
