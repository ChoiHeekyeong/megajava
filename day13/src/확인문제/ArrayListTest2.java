package Ȯ�ι���;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ArrayListTest2 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();//��ư�� ����� ������ Ŭ����
		
		for (int i = 0; i < 5; i++) {
			JButton b = new JButton(i+"��");
			list.add(b);
		}
		
		for (int i = 0; i < list.size(); i++) {
			JButton b2 = (JButton)list.get(i);
			System.out.println(b2.getText());
		}
		
		
	}

}
