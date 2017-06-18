package com.ManJiaSonPort.sync.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.Collection;
import java.util.Map;

public class NotEmpty {
	
	public static boolean notEmpty(Object ob){
		if(ob==null){
			return false;
		}else{
			if(ob instanceof String){
				if("".equals(ob)){return false;}else{return true;}
			}else if(ob instanceof Collection){
				if(((Collection) ob).size()>0){return true;}else{return false;}
			}else if(ob instanceof Map){
				if(((Map) ob).size()>0){return true;}else{return false;}
			}else if(ob instanceof JSONObject){
				if(((JSONObject) ob).isEmpty()){return false;}else{
					if(((JSONObject) ob).size()==0){return false;}else{return true;}
				}
			}else if(ob instanceof JSONArray){
				if(((JSONArray) ob).isEmpty()){return false;}else{
					if(((JSONArray) ob).size()==0){return false;}else{return true;}
				}
			}else{return true;}
		}
	}
	
	public static boolean allNotEmpty(Object[ ]obs){
		for(Object ob:obs){
			if(!notEmpty(ob)){return false;}
		}
		return true;
	}
}
