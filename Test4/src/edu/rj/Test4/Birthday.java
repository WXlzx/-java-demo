package edu.rj.Test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Birthday {

	public int day(String s){
		int month,day;
		int Nmonth,Nday;
		
		//现在的时间
		Calendar calendar1 = Calendar.getInstance();
		Date date = new Date();
		System.out.println("现在的时间为"+date.toLocaleString());
		
		//格式化时间		
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar calendar2 = Calendar.getInstance();
		//把生日字符串 由Date 类型 变为  日历
		try {
	
			Date d = sdf.parse(s);
			calendar2.setTime(d);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Nmonth = calendar1.get(Calendar.MONTH);
		Nday = calendar1.get(Calendar.DAY_OF_MONTH);
		
		month = calendar2.get(Calendar.MONTH);
		day = calendar2.get(Calendar.DAY_OF_MONTH);
		
		return (month-Nmonth)*30+(day-Nday);
		
//		interator i = set.interator();
//		while (i.hasNext()){
//			object obj = i.next()
//			System.out.println(obj)
//		}
	}
}
