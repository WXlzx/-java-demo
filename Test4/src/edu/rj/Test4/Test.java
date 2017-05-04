package edu.rj.Test4;

public class Test {

	public static void main(String[] args) {
		Birthday b = new Birthday();
		Week w = new Week();
		Day d = new Day();
		
		System.out.println("距离您生日还有"+b.day("2016年4月9日")+"天");
		w.getMonday();
		d.printDay();
	}

}
