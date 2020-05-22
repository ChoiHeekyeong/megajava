package 제어문정리문제;

import java.util.Scanner;

public class 인기투표 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int IU = 0; 
		int YOO = 0; 
		int BTS = 0; 
		while (true) {

			System.out.println("------------------------------");
			System.out.println("1.아이유 |2.유재석 |3.방탄소년단 |4.종료");
			System.out.println("------------------------------");

			System.out.print("선택>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				//IU = IU + 1;
				IU++;

			} else if (choice == 2) {
				//YOO =YOO+1;
				YOO++;
			} else if (choice == 3) {
				//BTS =BTS+1;
				BTS++;
				
			} else if (choice == 4) {
				System.out.println("시스템을 종료합니다.");
				System.out.println("<<최종 결과>>");
				System.out.println("==========");
				System.out.println("아이유: "+IU+"표");
				System.out.println("유재석: "+YOO+"표");
				System.out.println("방탄소년단: "+BTS+"표");
				System.exit(0);// break;

			} else {
				System.out.println("다시 선택해주세요.");
			}

		}

	}

}
