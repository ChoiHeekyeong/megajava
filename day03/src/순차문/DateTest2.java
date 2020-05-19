package ¼øÂ÷¹®;

import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		int hour = date.getHours();
		if(hour<11) {
			System.out.println("±Â¸ğ´×");
		}
		else if(hour<16) {
			System.out.println("±Â¾ÖÇÁÅÍ´«");
		}
		else if(hour<22) {
			System.out.println("±ÂÀÌºê´×");
		}
		else {
			System.out.println("±Â³ªÀÕ");
		}
		
		
		int month = date.getMonth()+1;
		if(month == 2) {
			System.out.println("28ÀÏ±îÁö");
		}
		else if(month==4||month==6||month==9||month==11) {
			System.out.println("30ÀÏ±îÁö");
		}
		else {
			System.out.println("31ÀÏ±îÁö");
		}
		
		
		
		
	}
	
	
	
	

}
