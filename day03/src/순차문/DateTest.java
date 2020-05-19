package 순차문;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		//년 월 일 요일
		//시 분 초
		
		int year = date.getYear()+1900;
		int month =  date.getMonth()+1;
		int daily = date.getDate(); //일
		int day = date.getDay();//0=일요일, 1=월요일
		
		
		String day1 = null;
		switch (day) {
		case 0:
			day1 = "일";
			break;
		case 1:
			day1 = "월";
			break;
		case 2:
			day1 = "화";
			break;
		case 3:
			day1 = "수";
			break;
		case 4:
			day1 = "목";
			break;
		case 5:
			day1 = "금";
			break;
		case 6:
			day1 = "토";
			break;
		default:
			break;
		}
		
		

		
		
		
		
		
		JOptionPane.showMessageDialog(null, year+"년 "+month+"월 " +daily+"일 "+day1+"요일");
		
		
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		JOptionPane.showMessageDialog(null, hour+"시 "+min+"분"+sec+"초");
		
		
		
		
		
		
	}

}
