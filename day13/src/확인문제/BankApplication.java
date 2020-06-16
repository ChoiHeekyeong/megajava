package 확인문제;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 계좌 목록을 관리할 클래스
		ArrayList list = new ArrayList();

		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성| 2.계좌목록| 3.예금| 4.출금| 5.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택> ");
			int select = sc.nextInt();

			if (select == 1) {
				// 계좌객체 생성 후 list에 추가.
				System.out.println("----------");
				System.out.println(" 계좌 생성중");
				System.out.println("----------");
				System.out.println("계좌번호: ");
				String no = sc.next();
				System.out.println("계좌주: ");
				String name = sc.next();
				System.out.println("초기 입금액: ");
				int money = sc.nextInt();

				Account a = new Account(no, name, money);
				list.add(a); // 리스트에 추가.
				System.out.println("결과: 계좌가 생성되었습니다.");

			} else if (select == 2) {
				// 계좌목록
				System.out.println("----------");
				System.out.println(" 계좌 목록");
				System.out.println("----------");

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i));
				}

			} else if (select == 3) {
				System.out.println("----------");
				System.out.println(" 예금");
				System.out.println("----------");
				System.out.println("계좌번호: ");
				String no = sc.next();

				int index = 0; //list내의 인덱스.
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index=i;
					}
				}
				Account a = (Account) list.get(index);
				
				
				System.out.println("입금액: ");
				int newMoney = sc.nextInt();
				a.money += newMoney;
				System.out.println("예금 처리 완료.");

			} else if (select == 4) {
				System.out.println("----------");
				System.out.println(" 출금");
				System.out.println("----------");
				System.out.println("계좌번호: ");
				String no = sc.next();

				int index = 0; //list내의 인덱스.
				for (int i = 0; i < list.size(); i++) {
					Account a = (Account)list.get(i);
					if(a.no.equals(no)) {
						index=i;
					}
				}
				Account a = (Account) list.get(index);
				
				System.out.println("출금액: ");
				int newMoney = sc.nextInt();
				a.money -= newMoney;
				System.out.println("출금 처리 완료.");

			} else if (select == 5) {
				System.out.println("프로그램 종료.");
				System.exit(0);
			} else {
				System.out.println("다른 번호를 누르세요");
			}

		}

	}

}
