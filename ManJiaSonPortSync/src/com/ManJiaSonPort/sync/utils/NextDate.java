package com.ManJiaSonPort.sync.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDate {
	/**
	 * addDate是负数就代表减去几天,addDate是正数代表加上几天
	 * */
	public static Date getNextDay(Date date,int addDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH,addDate);//+1今天的时间加一天
        date = calendar.getTime();
        return date;
    }

	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date =new Date( );
		System.out.println(sdf.format(date));
		System.out.println(sdf.format(getNextDay(date,3)));

	}

}
