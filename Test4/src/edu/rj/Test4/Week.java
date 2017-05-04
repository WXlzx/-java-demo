package edu.rj.Test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Week {
	public void getMonday(){
		int year,month,day;
		int n;
		
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy年MM月dd日");
		Calendar calendar = Calendar.getInstance();
		
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DAY_OF_MONTH);
		n = calendar.get(Calendar.DAY_OF_WEEK);
		
		try {
			Date d = sdf.parse(year+"年"+(month+1)+"月"+(day-n+2)+"日");
			System.out.println("周一的日期为"+sdf.format(d));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
