package Ȯ�ι���;

import java.util.ArrayList;

import javax.swing.JFrame;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//ũ�������� ����
		
		list.add("����");
		list.add("����");
		
		System.out.println(list.size());
		list.add("����");
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.get(0));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println(list);
		
		
		System.out.println("----------");
		
		
		
		
		
		
		
		
	}

}
