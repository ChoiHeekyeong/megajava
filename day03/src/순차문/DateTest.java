package ������;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DateTest {

	public static void main(String[] args) {
		
		Date date = new Date();
		//�� �� �� ����
		//�� �� ��
		
		int year = date.getYear()+1900;
		int month =  date.getMonth()+1;
		int daily = date.getDate(); //��
		int day = date.getDay();//0=�Ͽ���, 1=������
		
		
		String day1 = null;
		switch (day) {
		case 0:
			day1 = "��";
			break;
		case 1:
			day1 = "��";
			break;
		case 2:
			day1 = "ȭ";
			break;
		case 3:
			day1 = "��";
			break;
		case 4:
			day1 = "��";
			break;
		case 5:
			day1 = "��";
			break;
		case 6:
			day1 = "��";
			break;
		default:
			break;
		}
		
		

		
		
		
		
		
		JOptionPane.showMessageDialog(null, year+"�� "+month+"�� " +daily+"�� "+day1+"����");
		
		
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		JOptionPane.showMessageDialog(null, hour+"�� "+min+"��"+sec+"��");
		
		
		
		
		
		
	}

}
