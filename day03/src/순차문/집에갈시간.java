package ������;

import java.util.Date;

import javax.swing.JOptionPane;

public class �������ð� {

	public static void main(String[] args) {
		
		//�ð��� �����ִ� Ŭ����
		//Date, Calendar
		//C����̺꿡�ִ� ���̺귯���κ��� �����Ѵٴ� Ű���� = new
		Date date = new Date(); //c����̺꿡 �ִ� Date()�� Date date�� �ִ´ٴ� ��!
		
		int time = date.getHours();
		System.out.println(date.getSeconds());
		
		
		if(time>=22) {
			JOptionPane.showMessageDialog(null, "���� �� �ð��� �� �ȳ���.");
		}
		else {
			JOptionPane.showMessageDialog(null, "���� �� �ð��� ���� ����");
		}
		
		
	}

}
