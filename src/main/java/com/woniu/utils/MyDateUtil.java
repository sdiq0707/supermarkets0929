package com.woniu.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期与字符串转换工具
 * Date---->String
 * String--->Date
 * 
 * Calendar---->Date
 * Date--->Calendar
 * 
 * Calendar-->Date-->String
 * String-->Date-->Calendar
 * 
 * util.Date--->sql.Date
 * sql.Date-->util.Date
 */
public class MyDateUtil {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	/**
	 * Date 日期-->String 字符串
	 * @param(参数)  date 传入日期类型
	 * @return 返回字符串类型 
	 */
	public static String dateToString(Date date)
	{
		if(date == null)
		{
			return null;
		}
		return sdf.format(date);
	}
	
	/**
	 * Calendar 日历--->String 字符串
	 * @param Calendar 传入日历类型
	 * @return 返回字符串类型
	 */
	public static String calendarToString(Calendar calendar)
	{
		if(calendar == null)
		{
			return null;
		}
		return sdf.format(calendar.getTime());
	}
	
	/**
	 * String 字符串-->Date日期
	 * @param string 传入字符串类型
	 * @return 返回日期了类型
	 */
	public static Date StringToDate(String string)
	{
		try{
			return sdf.parse(string);
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * String 字符串-->Calendar 日历
	 * @param String 传入字符串类型
	 * @return 返回日历类型
	 */
	public static Calendar StringToCalendar(String string)
	{
		try{
			//Calendar不能创建对象，但它的子类可以，所以这里是获取Calendar的实例
			Calendar calendar = Calendar.getInstance();
			//把字符转为日期类型，再calendar把日期类型 设置为指定日期
			calendar.setTime(sdf.parse(string)); //calendar的可以设置指定日期
			return calendar;
		}
		catch(ParseException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Date 日期---->Calendar 日历
	 * @param date 传入Date 类型日期
	 * @return 返回Calendar 类型日历
	 */
	public static Calendar dateToCalendar(Date date)
	{
		if(date ==null)
		{
			return null;
		}
		Calendar calendar = Calendar.getInstance();
		//将传入的Date日期赋值给当前calendar
		calendar.setTime(date);
		return calendar;
	}
	
	/**
	 * Calendar 日历---->Date 日期
	 * @param calendar 传入Calendar类型日历
	 * @return 返回Date类型日期
	 *
	 */
	
	public static Date calendarToDate(Calendar calendar)
	{
		if(calendar ==null)
		{
			return null;
		}
		return calendar.getTime();
	}
	
	
	/**
	 * Java.util.Date(父类) java 日期    ------>java.sql.Date(子类) 数据库日期
	 * long utilMillionSeconds = date.getTime();  //util.Date--->毫秒值：   date.getTime()获取毫秒值
	 * 
	 * java.sql.Date sqlDate = new java.sql.Date(utilMillionSeconds);//sql.Date(毫秒值)---->java.sql.Date 年月日
	 * java.sql.Time time = new java.sql.Time(utilMillionSeconds);//sql.Date(毫秒值)----->java.sql.Time 时分秒
	 * java.sql.TimeStamp = new java.sql.TimeStamp(utilMillonSeconds);//sql.Date(毫秒值)---->java.sql.TimeStamp 年月日 时分秒
	 * 
	 * @param date   java日期
	 * @return  date     sql数据库日期
	 */
	public static Date utilDateToSqlDate(java.util.Date utilDate)
	{
		if(utilDate ==null)
		{
			return null;
		}
		//util.date转换为毫秒 值  date.getTime()
		long utilMillionSeconds = utilDate.getTime();  //util.Date -->毫秒值
		//通过构造函数把util.date的毫秒值转换为sql.date毫秒值
		java.sql.Date sqlDate = new java.sql.Date(utilMillionSeconds); //sql.Date(毫秒值)--->java.sql.Date 年月日格式
		return sqlDate;
		
		//java.sql.Time time = new java.sql.Time(utilMillionSeconds); //sql.Date(毫秒值)--->java.sql.Time 时分秒格式
		// return time;
		
		//java.sql.TimeStamp timestamp = new java.sql.TimeStamp(utilMillionSeconds); //sql.Date(毫秒值)---->java.sql.Timestamp 年月日 时分秒
		//return timestamp;
		
	}
	
	/**
	 * sql.Date (子类)  数据库日期   ------->util.Date(父类)  java 日期   ：上溯造型-->子类向上自动转转换为父类类型，所以此处不需要特殊处理
	 * 
	 * java.sql.Date 年月日
	 * java.sql.Time 时分秒
	 * java.sql.Timestamp 年月日 时分秒
	 * 
	 */
	//java.sql.Date 年月日格式
	public static Date sqlDateToUtilDate(java.sql.Date sqlDate)
	{
		if(sqlDate == null)
		{
			return null;
		}
		//java.sql.Date 年月日格式
		return sqlDate;		
	}
	
	//java.sql.Time 时分秒格式
	public static Date sqlDateToUtilDate(java.sql.Time sqlDate)
	{
		if(sqlDate == null)
		{
			return null;
		}
		//java.sql.Time 时分秒格式
		return sqlDate;		
	}
	
	//java.sql.Timestamp 年月日 时分秒格式
	public static Date sqlDateToUtilDate(java.sql.Timestamp sqlDate)
	{
		if(sqlDate == null)
		{
			return null;
		}
		//java.sql.Time 年月日 时分秒格式
		return sqlDate;		
	}
}
