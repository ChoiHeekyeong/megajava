package ������;

import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		int hour = date.getHours();
		if(hour<11) {
			System.out.println("�¸��");
		}
		else if(hour<16) {
			System.out.println("�¾����ʹ�");
		}
		else if(hour<22) {
			System.out.println("���̺��");
		}
		else {
			System.out.println("�³���");
		}
		
		
		int month = date.getMonth()+1;
		if(month == 2) {
			System.out.println("28�ϱ���");
		}
		else if(month==4||month==6||month==9||month==11) {
			System.out.println("30�ϱ���");
		}
		else {
			System.out.println("31�ϱ���");
		}
		
		
		
		
	}
	
	
	
	

}
