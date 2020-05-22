package 제어문정리문제;

import java.util.Scanner;

public class 은행문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int money = 0;
		int balance = 10000;
		int ch = 0;
		System.out.println("현재 잔고 = " + balance);
		while (true) {

			System.out.println("-------------------------");
			System.out.println("1.예금 |2.출금 |3.잔고 |4.종료");
			System.out.println("-------------------------");

			System.out.print("선택>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("예금액>> ");
				money = sc.nextInt();
				balance = balance + money;
				System.out.println("현재 잔고= " + balance);

			} else if (choice == 2) {
				System.out.print("출금액>> ");
				ch = sc.nextInt();
				balance = balance - ch;
				System.out.println("현재 잔고= " + balance);

			} else if (choice == 3) {
				System.out.print("잔고>> ");
				System.out.println(balance);

			} else if (choice == 4) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				// break;

			} else {
				System.out.println("다시 선택해주세요.");
			}

		}

	}

}
