package ���빮��;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1.create
		System.out.println("id �Է� >> ");
		String id = sc.next();
		System.out.println("pw �Է� >> ");
		String pw = sc.next();
		
		
		//dbó��(dao)
		
		//�͸�Ŭ������ ������.
		DAOInterface dao = new DAOInterface() {
			
			@Override
			public void update(String id, String pw) {
				System.out.println(id+"�� ��й�ȣ�� "+pw+"�� ����Ǿ����ϴ�");
			}
			
			@Override
			public void read(String id) {
				System.out.println(id+"�� ��й�ȣ�� "+pw+"�Դϴ�");
				
			}
			
			@Override
			public void delete(String id) {
				System.out.println(id+"�� �����Ǿ����ϴ�");
				
			}
			
			@Override
			public void create(String id, String pw) {
				System.out.println(id+", "+pw+"�� �����Ϸ�");
				
			}
		};
		
		dao.create(id, pw);
		dao.read(id);
		dao.update(id, pw);
		dao.delete(id);
		
		
		
	}

}
