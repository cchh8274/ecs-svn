package com.util;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author chenghui
 *
 */
public class DateUtils {
	
	 public static String getCurrDate(){
		 Date  date=new Date();
		 SimpleDateFormat  sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 return sdf.format(date);
	 }
}
