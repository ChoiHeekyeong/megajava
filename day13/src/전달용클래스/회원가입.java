package ���޿�Ŭ����;

import java.util.Scanner;

public class ȸ������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ�� id: ");
		String id = sc.next();
		System.out.println("ȸ�� pw: ");
		String pw = sc.next();
		System.out.println("ȸ�� name: ");
		String name = sc.next();
		System.out.println("ȸ�� tel: ");
		String tel = sc.next();
		
		//�Է��� �����͵��� DB����� Ŭ������ �ѱ�
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO bag = new MemberDTO(); //�������
		//���濡 ������ �־���
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		
		//������ dbó�� Ŭ������ ����
		dao.insert(bag);
	}

}
