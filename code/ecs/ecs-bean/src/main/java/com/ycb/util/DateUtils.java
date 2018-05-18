package com.ycb.util;

import java.sql.Timestamp;  
import java.text.ParseException;  
import java.text.ParsePosition;  
import java.text.SimpleDateFormat;  
import java.time.format.DateTimeFormatter;  
import java.util.Calendar;  
import java.util.Date;  
import java.util.GregorianCalendar;  
import java.util.Locale;  
import java.util.Random;  

public class DateUtils {
    
    public static String pattern="yyyy-MM-dd";  
    public static SimpleDateFormat formatter = new SimpleDateFormat(pattern);  
    public static SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    public static DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);  
    public static DateTimeFormatter getDateTimeFormatter(){  
       return dateFormatter;   
    }  
    /** 
     * 获取现在时间 
     *  
     * @return 返回时间类型 yyyy-MM-dd HH:mm:ss 
     */  
    public static Date getNowDate() {  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
     String dateString = formatter.format(new Date());  
     ParsePosition pos = new ParsePosition(8);  
     Date currentTime_2 = formatter.parse(dateString, pos);  
     return currentTime_2;  
    }  
 
    /** 
     * 获取现在时间 
     *  
     * @return返回短时间格式 yyyy-MM-dd 
     */  
    public static Date getNowDateShort() {  
     String dateString = formatter.format(new Date());  
     ParsePosition pos = new ParsePosition(8);  
     Date currentTime_2 = formatter.parse(dateString, pos);  
     return currentTime_2;  
    }  
 
    /** 
     * 获取现在时间 
     *  
     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss 
     */  
    public static String getStringDate() {  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
     String dateString = formatter.format(new Date());  
     return dateString;  
    }  
    /** 
     * 获取现在时间 
     * @return返回字符串格式 yyyyMMddHHmmss 
     */  
    public static String getStringAllDate() {  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssSSS");  
     String dateString = formatter.format(new Date());  
     return dateString;  
    }  
    /** 
     * 获取现在时间 
     *  
     * @return 返回短时间字符串格式yyyy-MM-dd 
     */  
    public static String getStringDateShort() {  
     String dateString = formatter.format( new Date());  
     return dateString;  
    }  
 
    /** 
     * 获取时间 小时:分;秒 HH:mm:ss 
     *  
     * @return 
     */  
    public static String getTimeShort() {  
     SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
     String dateString = formatter.format(new Date());  
     return dateString;  
    }  
 
    /** 
     * 将长时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss 
     *  
     * @param strDate 
     * @return 
     */  
    public static Date strToDateLong(String strDate) {  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
     ParsePosition pos = new ParsePosition(0);  
     Date strtodate = formatter.parse(strDate, pos);  
     return strtodate;  
    }  
 
    /** 
     * 将长时间格式时间转换为字符串 yyyy-MM-dd HH:mm:ss 
     *  
     * @param dateDate 
     * @return 
     */  
    public static String dateToStrLong(java.util.Date dateDate) {  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
     String dateString = formatter.format(dateDate);  
     return dateString;  
    }  
 
    /** 
     * 将短时间格式时间转换为字符串 yyyy-MM-dd 
     *  
     * @param dateDate 
     * @param k 
     * @return 
     */  
    public static String dateToStr(java.util.Date dateDate) {  
     String dateString = formatter.format(dateDate);  
     return dateString;  
    }  
      
    public static String dateToStr(java.time.LocalDate dateDate) {  
         String dateString = dateFormatter.format(dateDate);  
         return dateString;  
        }  
 
    /** 
     * 将短时间格式字符串转换为时间 yyyy-MM-dd  
     *  
     * @param strDate 
     * @return 
     */  
    public static Date strToDate(String strDate) {  
     ParsePosition pos = new ParsePosition(0);  
     Date strtodate = formatter.parse(strDate, pos);  
     return strtodate;  
    }  
 
    /** 
     * 将短时间格式字符串转换为时间 yyyy-MM-dd HH:mm:ss 
     *  
     * @param strDate 
     * @return 
     */  
    public static  Timestamp strToDateSql(String strDate) {  
     ParsePosition pos = new ParsePosition(0);  
     Date strtodate = formatter2.parse(strDate, pos);  
     return new Timestamp(strtodate.getTime());  
    }  
    /** 
     * 得到现在时间 
     *  
     * @return 
     */  
    public static Date getNow() {  
     Date currentTime = new Date();  
     return currentTime;  
    }  
 
    /** 
     * 提取一个月中的最后一天 
     *  
     * @param day 
     * @return 
     */  
    public static Date getLastDate(long day) {  
     Date date = new Date();  
     long date_3_hm = date.getTime() - 3600000 * 34 * day;  
     Date date_3_hm_date = new Date(date_3_hm);  
     return date_3_hm_date;  
    }  
 
    /** 
     * 得到现在时间 
     *  
     * @return 字符串 yyyyMMdd HHmmss 
     */  
    public static String getStringToday() {  
     Date currentTime = new Date();  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd HHmmss");  
     String dateString = formatter.format(currentTime);  
     return dateString;  
    }  
    /** 
     *  
     * 功能：<br/> 
     * 
     * @author Tony 
     * @version 2016年12月16日 下午4:41:51 <br/> 
     */  
    public static String getTodayShort() {  
     Date currentTime = new Date();  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");  
     String dateString = formatter.format(currentTime);  
     return dateString;  
    }  
    /** 
     *  
     * @Description: 输入一个整数类型的字符串,然后转换成时分秒的形式输出 
     *    例如：输入568  
     *          返回结果为：00:09:28 
     *          输入null或者“” 
     *          返回结果为:00:00:00 
     * @param @param value 
     * @param @return    
     * @return String   
     * @throws 
     * @author Tony 鬼手卡卡 
     * @date 2016-4-20 
     */  
    public static String getHHMMSS(String value){  
        String hour="00";  
        String minute="00";  
        String second="00";  
        if(value!=null&&!value.trim().equals("")){  
            int v_int=Integer.valueOf(value);  
            hour=v_int/3600+"";//获得小时;  
            minute=v_int%3600/60+"";//获得小时;  
            second=v_int%3600%60+"";//获得小时;  
        }  
        return (hour.length()>1?hour:"0"+hour)+":"+(minute.length()>1?minute:"0"+minute)+":"+(second.length()>1?second:"0"+second);  
    }  
    /** 
     * 得到现在小时 
     */  
    public static String getHour() {  
     Date currentTime = new Date();  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
     String dateString = formatter.format(currentTime);  
     String hour;  
     hour = dateString.substring(11, 13);  
     return hour;  
    }  
 
    /** 
     * 得到现在分钟 
     *  
     * @return 
     */  
    public static String getTime() {  
     Date currentTime = new Date();  
     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
     String dateString = formatter.format(currentTime);  
     String min;  
     min = dateString.substring(14, 16);  
     return min;  
    }  
 
    /** 
     * 根据用户传入的时间表示格式，返回当前时间的格式 如果是yyyyMMdd，注意字母y不能大写。 
     *  
     * @param sformat 
     *            yyyyMMddhhmmss 
     * @return 
     */  
    public static String getUserDate(String sformat) {  
     Date currentTime = new Date();  
     SimpleDateFormat formatter = new SimpleDateFormat(sformat);  
     String dateString = formatter.format(currentTime);  
     return dateString;  
    }  
 
    /** 
     * 二个小时时间间的差值,必须保证二个时间都是"HH:MM"的格式，返回字符型的分钟 
     */  
    public static String getTwoHour(String st1, String st2) {  
     String[] kk = null;  
     String[] jj = null;  
     kk = st1.split(":");  
     jj = st2.split(":");  
     if (Integer.parseInt(kk[0]) < Integer.parseInt(jj[0]))  
      return "0";  
     else {  
      double y = Double.parseDouble(kk[0]) + Double.parseDouble(kk[1]) / 60;  
      double u = Double.parseDouble(jj[0]) + Double.parseDouble(jj[1]) / 60;  
      if ((y - u) > 0)  
       return y - u + "";  
      else  
       return "0";  
     }  
    }  
 
    /** 
     * 得到二个日期间的间隔天数 
     */  
    public static String getTwoDay(String sj1, String sj2) {  
     long day = 0;  
     try {  
      java.util.Date date = formatter.parse(sj1);  
      java.util.Date mydate = formatter.parse(sj2);  
      day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);  
     } catch (Exception e) {  
      return "";  
     }  
     return day + "";  
    }  
 
    /** 
     * 时间前推或后推分钟,其中JJ表示分钟. 
     */  
    public static String getPreTime(String sj1, String jj) {  
     SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
     String mydate1 = "";  
     try {  
      Date date1 = format.parse(sj1);  
      long Time = (date1.getTime() / 1000) + Integer.parseInt(jj) * 60;  
      date1.setTime(Time * 1000);  
      mydate1 = format.format(date1);  
     } catch (Exception e) {  
     }  
     return mydate1;  
    }  
 
    /** 
     * 得到一个时间延后或前移几天的时间,nowdate(yyyy-mm-dd)为时间,delay为前移或后延的天数 
     */  
    public static String getNextDay(String nowdate, String delay) {  
     try{  
     String mdate = "";  
     Date d = strToDate(nowdate);  
     long myTime = (d.getTime() / 1000) + Integer.parseInt(delay) * 24 * 60 * 60;  
     d.setTime(myTime * 1000);  
     mdate = formatter.format(d);  
     return mdate;  
     }catch(Exception e){  
      return "";  
     }  
    }  
    /** 
     *  
     * 功能：<br/> 距离现在几天的时间是多少 
     * 获得一个时间字符串，格式为：yyyy-MM-dd HH:mm:ss 
     * day  如果为整数，表示未来时间 
     *      如果为负数，表示过去时间 
     * @author Tony 
     * @version 2016年11月29日 上午11:02:56 <br/> 
     */  
    public static String getFromNow(int day) {  
        Date date = new Date();  
         long dateTime = (date.getTime() / 1000) + day * 24 * 60 * 60;  
         date.setTime(dateTime * 1000);  
         return formatter2.format(date);  
    }  
    /** 
     * 判断二个时间是否在同一个周 
     *  
     * @param date1 
     * @param date2 
     * @return 
     */  
    public static boolean isSameWeekDates(Date date1, Date date2) {  
     Calendar cal1 = Calendar.getInstance();  
     Calendar cal2 = Calendar.getInstance();  
     cal1.setTime(date1);  
     cal2.setTime(date2);  
     int subYear = cal1.get(Calendar.YEAR) - cal2.get(Calendar.YEAR);  
     if (0 == subYear) {  
      if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))  
       return true;  
     } else if (1 == subYear && 11 == cal2.get(Calendar.MONTH)) {  
      // 如果12月的最后一周横跨来年第一周的话则最后一周即算做来年的第一周  
      if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))  
       return true;  
     } else if (-1 == subYear && 11 == cal1.get(Calendar.MONTH)) {  
      if (cal1.get(Calendar.WEEK_OF_YEAR) == cal2.get(Calendar.WEEK_OF_YEAR))  
       return true;  
     }  
     return false;  
    }  
 
    /** 
     * 产生周序列,即得到当前时间所在的年度是第几周 
     *  
     * @return 
     */  
    public static String getSeqWeek() {  
     Calendar c = Calendar.getInstance(Locale.CHINA);  
     String week = Integer.toString(c.get(Calendar.WEEK_OF_YEAR));  
     if (week.length() == 1)  
      week = "0" + week;  
     String year = Integer.toString(c.get(Calendar.YEAR));  
     return year + week;  
    }  
 
    /** 
     * 获得一个日期所在的周的星期几的日期，如要找出2002年2月3日所在周的星期一是几号 
     *  
     * @param sdate 
     * @param num 
     * @return 
     */  
    public static String getWeek(String sdate, String num) {  
     // 再转换为时间  
     Date dd = DateUtils.strToDate(sdate);  
     Calendar c = Calendar.getInstance();  
     c.setTime(dd);  
     if (num.equals("1")) // 返回星期一所在的日期  
      c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);  
     else if (num.equals("2")) // 返回星期二所在的日期  
      c.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);  
     else if (num.equals("3")) // 返回星期三所在的日期  
      c.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);  
     else if (num.equals("4")) // 返回星期四所在的日期  
      c.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);  
     else if (num.equals("5")) // 返回星期五所在的日期  
      c.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);  
     else if (num.equals("6")) // 返回星期六所在的日期  
      c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);  
     else if (num.equals("0")) // 返回星期日所在的日期  
      c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);  
     return new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());  
    }  
 
    /** 
     * 根据一个日期，返回是星期几的字符串 
     *  
     * @param sdate 
     * @return 
     */  
    public static String getWeek(String sdate) {  
     // 再转换为时间  
     Date date = DateUtils.strToDate(sdate);  
     Calendar c = Calendar.getInstance();  
     c.setTime(date);  
     // int hour=c.get(Calendar.DAY_OF_WEEK);  
     // hour中存的就是星期几了，其范围 1~7  
     // 1=星期日 7=星期六，其他类推  
     return new SimpleDateFormat("EEEE").format(c.getTime());  
    }  
    public static String getWeekStr(String sdate){  
     String str = "";  
     str = DateUtils.getWeek(sdate);  
     if("1".equals(str)){  
      str = "星期日";  
     }else if("2".equals(str)){  
      str = "星期一";  
     }else if("3".equals(str)){  
      str = "星期二";  
     }else if("4".equals(str)){  
      str = "星期三";  
     }else if("5".equals(str)){  
      str = "星期四";  
     }else if("6".equals(str)){  
      str = "星期五";  
     }else if("7".equals(str)){  
      str = "星期六";  
     }  
     return str;  
    }  
 
    /** 
     * 两个时间之间的天数 
     *  
     * @param date1 
     * @param date2 
     * @return 
     */  
    public static long getDays(String date1, String date2) {  
     if (date1 == null || date1.equals(""))  
      return 0;  
     if (date2 == null || date2.equals(""))  
      return 0;  
     // 转换为标准时间  
     java.util.Date date = null;  
     java.util.Date mydate = null;  
     try {  
      date = formatter.parse(date1);  
      mydate = formatter.parse(date2);  
     } catch (Exception e) {  
     }  
     long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);  
     return day;  
    }  
 
    /** 
     * 形成如下的日历 ， 根据传入的一个时间返回一个结构 星期日 星期一 星期二 星期三 星期四 星期五 星期六 下面是当月的各个时间 
     * 此函数返回该日历第一行星期日所在的日期 
     *  
     * @param sdate 
     * @return 
     */  
    public static String getNowMonth(String sdate) {  
     // 取该时间所在月的一号  
     sdate = sdate.substring(0, 8) + "01";  
 
     // 得到这个月的1号是星期几  
     Date date = DateUtils.strToDate(sdate);  
     Calendar c = Calendar.getInstance();  
     c.setTime(date);  
     int u = c.get(Calendar.DAY_OF_WEEK);  
     String newday = DateUtils.getNextDay(sdate, (1 - u) + "");  
     return newday;  
    }  
    /** 
     *  
     * @param args 
     */  
    public static boolean RightDate(String date) {  
 
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
     ;  
     if (date == null)  
      return false;  
     if (date.length() > 10) {  
      sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
     } else {  
      sdf = new SimpleDateFormat("yyyy-MM-dd");  
     }  
     try {  
      sdf.parse(date);  
     } catch (ParseException pe) {  
      return false;  
     }  
     return true;  
    }  
    
    /** 
     *  
     * 功能：<br/> 
     * 
     * @author Tony 
     * @version 2015-3-31 上午09:29:31 <br/> 
     */  
    public static String getOKDate(String sdate) {  
     if (sdate == null || sdate.equals(""))  
      return getStringDateShort();  
 
//   if (!VeStr.Isdate(sdate)) {  
//    sdate = getStringDateShort();  
//   }  
//   // 将“/”转换为“-”  
//   sdate = VeStr.Replace(sdate, "/", "-");  
     // 如果只有8位长度，则要进行转换  
     if (sdate.length() == 8)  
      sdate = sdate.substring(0, 4) + "-" + sdate.substring(4, 6) + "-" + sdate.substring(6, 8);  
     ParsePosition pos = new ParsePosition(0);  
     Date strtodate = formatter.parse(sdate, pos);  
     String dateString = formatter.format(strtodate);  
     return dateString;  
    }  
    /**  
        * 获取当前时间的前一天时间  
        * @param cl  
        * @return  
        */    
       private static String getBeforeDay(Calendar cl){    
           //使用roll方法进行向前回滚    
           //cl.roll(Calendar.DATE, -1);    
           //使用set方法直接进行设置    
          // int day = cl.get(Calendar.DATE);    
           cl.add(Calendar.DATE, -1);    
           return formatter.format(cl.getTime());    
       }    
       /*
        * 获取当月第一天
        */
     //规定返回日期格式
       public static String getBeforeDayaavvv(){    
     		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
     		Calendar calendar=Calendar.getInstance();
     		Date theDate=calendar.getTime();
     		GregorianCalendar gcLast=(GregorianCalendar)Calendar.getInstance();
     		gcLast.setTime(theDate);
     		//设置为第一天
     		gcLast.set(Calendar.DAY_OF_MONTH, 1);
     		String day_first=sf.format(gcLast.getTime());
     		//打印本月第一天
     	      String day_firsta =	day_first+" 00:00:00";
     		  return day_firsta;
     		//获取Calendar
       }
       public static String getBeforeDayaa(){    
     //获取Calendar
       Calendar calendar=Calendar.getInstance();
       //设置日期为本月最大日期
       calendar.set(Calendar.DATE, calendar.getActualMaximum(calendar.DATE));
       //设置日期格式
       SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
       String ss=sf.format(calendar.getTime());
       String ssa = ss+" 23:59:59";
       return ssa;
       }
       /**
        * 当前时间的前一天
        * @return
        */
       public static String getBeforeDaybb(){    
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
       Date date=new Date();  
       Calendar calendar = Calendar.getInstance();  
       calendar.setTime(date);  
       calendar.add(Calendar.DAY_OF_MONTH, -1);  
       date = calendar.getTime();  
       String sdfd =sdf.format(date);
       return sdfd;
       }
}
