package Ȯ�ι���;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���� ����� ������ Ŭ����
		ArrayList list = new ArrayList();

		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»���| 2.���¸��| 3.����| 4.���| 5.����");
			System.out.println("---------------------------------------");
			System.out.println("����> ");
			int select = sc.nextInt();

			if (select == 1) {
				// ���°�ü ���� �� list�� �߰�.
				System.out.println("----------");
				System.out.println(" ���� ������");
				System.out.println("----------");
				System.out.println("���¹�ȣ: ");
				String no = sc.next();
				System.out.println("������: ");
				String name = sc.next();
				System.out.println("�ʱ� �Աݾ�: ");
				int money = sc.nextInt();

				Account a = new Account(no, name, money);
				list.add(a); // ����Ʈ�� �߰�.
				System.out.println("���: ���°� �����Ǿ����ϴ�.");

			} else if (select == 2) {
				// ���¸��
				System.out.println("----------");
				System.out.println(" ���� ���");
				System.out.println("----------");

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

			} else if (select == 3) {
				System.out.println("----------");
				System.out.println(" ����");
				System.out.println("----------");
				System.out.println("���¹�ȣ: ");
				String no = sc.next();

				int index = 0; //list���� �ε���.
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index=i;
					}
				}
				Account a = (Account) list.get(index);
				
				
				System.out.println("�Աݾ�: ");
				int newMoney = sc.nextInt();
				a.money += newMoney;
				System.out.println("���� ó�� �Ϸ�.");

			} else if (select == 4) {
				System.out.println("----------");
				System.out.println(" ���");
				System.out.println("----------");
				System.out.println("���¹�ȣ: ");
				String no = sc.next();

				int index = 0; //list���� �ε���.
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index=i;
					}
				}
				Account a = (Account) list.get(index);
				
				System.out.println("��ݾ�: ");
				int newMoney = sc.nextInt();
				a.money -= newMoney;
				System.out.println("��� ó�� �Ϸ�.");

			} else if (select == 5) {
				System.out.println("���α׷� ����.");
				System.exit(0);
			} else {
				System.out.println("�ٸ� ��ȣ�� ��������");
			}

		}

	}

}
