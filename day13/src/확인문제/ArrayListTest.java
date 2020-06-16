package 확인문제;

import java.util.ArrayList;

import javax.swing.JFrame;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//크기제한이 없음
		
		list.add("감자");
		list.add("고구마");
		
		System.out.println(list.size());
		list.add("양파");
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
