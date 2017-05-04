package edu.rj.Test4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day {
	public void printDay(){
		SimpleDateFormat  sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat  sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat  sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat  sdf4 = new SimpleDateFormat("MM月dd日yyyy年");
		Date date = new Date();
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
	}
	
}
