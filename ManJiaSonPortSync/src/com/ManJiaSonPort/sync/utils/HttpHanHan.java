package com.ManJiaSonPort.sync.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
* @param是strUrl 请求地址
* @param是params 请求参数
* @param是method 请求方法
* @return  网络请求字符串
* @throws Exception
*/
public class HttpHanHan {
//////////////////////////////////////////////////////////////////////////////
	public static final String DEF_CHATSET = "UTF-8";
	/**
	 * http连接超时时间
	 * */
    public static final int DEF_CONN_TIMEOUT = 50000;
    /**
	 * http读取时间
	 * */
    public static final int DEF_READ_TIMEOUT = 50000;
    public static String userAgent =  "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    //配置您申请的KEY
    public static final String APPKEY ="e8d954b7c15ea64ae2c7f153f3b73b1b";
//////////////////////////////////////////////////////////////////////////////   
    
    
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jsonstr=" { \"pagenum\": \"1\"}";
		String sign="";
		String spwdsign="womai.itemlist.get14082667wertycdewsf9fasdfgd04d09009211"+jsonstr;
		
		sign=MD5Utils.generatePassword(spwdsign);
		System.out.println(sign+"-----------------------");		
		 //聚合数据  begin
		  String weatherresult =null;
	        String url ="http://sandbox.womaiapp.com/api/rest";//请求接口地址
	        Map<String,String> params = new HashMap<String,String>();//请求参数
	            params.put("method","womai.itemlist.get");//要查询的城市，如：温州、上海、北京
	            params.put("appkey","140826");//应用APPKEY(应用详细页查询)
	            params.put("sign",sign);//应用APPKEY(应用详细页查询)
	            
	            params.put("param",jsonstr);//返回数据的格式,xml或json，默认json
	  
	        try {
	        	weatherresult =net(url, params,"POST");
	           System.out.println(weatherresult);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	           
		  //聚合数据  end

	}
    
//////////////////////////////////////////////////////////////////////////////    
    
    
    
    
    
    public static String net(String strUrl, Map params,String sendMethod) throws Exception {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuffer sb = new StringBuffer();
            if(sendMethod==null || sendMethod.equals("GET")){
                strUrl = strUrl+"?"+urlencode(params);
            }
            URL url = new URL(strUrl);
            conn = (HttpURLConnection) url.openConnection();
            if(sendMethod==null || sendMethod.equals("GET")){
                conn.setRequestMethod("GET");
            }else{
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            conn.connect();
            if (params!= null && sendMethod.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlencode(params));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                reader.close();
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }
    
//////////////////////////////////////////////////////////////////////////////    
	
    
    
	/////////////////////////////// 下面是工具实体///////////////////////////////////////////////
	// 将map型转为请求参数型
	public static String urlencode(Map<String, String> data) {
		StringBuilder sb = new StringBuilder();
		for (Map.Entry i : data.entrySet()) {
			try {
				sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}
    
    
    
//////////////////////////////////////////////////////////////////////////////    
    
	
	//
    public static void getRequest1(String cityname){
        String result =null;
        String url ="http://op.juhe.cn/onebox/weather/query";//请求接口地址
        Map params = new HashMap();//请求参数
            params.put("cityname",cityname);//
            params.put("key",APPKEY);//应用APPKEY(应用详细页查询)
            params.put("dtype","json");//返回数据的格式,xml或json，默认json
  
        try {
            result =net(url, params, "GET");
             
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }
    
//////////////////////////////////////////////////////////////////////////////


}
//////////////////////////////////////////////////////////////////////////////
