package �����������;

import java.util.Scanner;

public class ���๮�� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = 0;
		int balance = 10000;
		int ch = 0;
		System.out.println("���� �ܰ� = " + balance);
		while (true) {

			System.out.println("-------------------------");
			System.out.println("1.���� |2.��� |3.�ܰ� |4.����");
			System.out.println("-------------------------");

			System.out.print("����>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("���ݾ�>> ");
				money = sc.nextInt();
				balance = balance + money;
				System.out.println("���� �ܰ�= " + balance);

			} else if (choice == 2) {
				System.out.print("��ݾ�>> ");
				ch = sc.nextInt();
				balance = balance - ch;
				System.out.println("���� �ܰ�= " + balance);

			} else if (choice == 3) {
				System.out.print("�ܰ�>> ");
				System.out.println(balance);

			} else if (choice == 4) {
				System.out.println("�ý����� �����մϴ�.");
				System.exit(0);
				// break;

			} else {
				System.out.println("�ٽ� �������ּ���.");
			}

		}

	}

}
