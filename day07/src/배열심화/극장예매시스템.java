package 배열심화;

import java.util.Scanner;

public class 극장예매시스템 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] seat = new int[10];
		int count = 0;
		while (true) {
		System.out.println("-----------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(" "+(i+1));
		}
		System.out.println();
		System.out.println("-----------------------");	
		for (int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i]);
		}
		
		
		System.out.println();
		System.out.println();
			System.out.print("몇 번 좌석을 예매하시겠습니까?(종료:-1) >> ");
			int num = sc.nextInt();
			if(num == -1) {
				System.out.println("당신의 예약 좌석 수는 "+ count +"개 입니다");
				System.out.println("예매를 종료합니다.");
				System.out.println("총 결제 금액은 "+(count*10000)+"원 입니다.");
				break;
			}
			
			//예매하기 전에 그 자리가 이미 예매가 된 자리인지 확인해야 한다.
			if(seat[num-1]==1) {
				System.out.println();
				System.out.println("※이미 예매가 된 자리입니다.");
				System.out.println("다른 자리를 예매해주세요.");
				System.out.println();
			}
			else {
			//예매처리
			seat[num-1] = 1;
			
			System.out.println("예매가 완료 되었습니다.");
			count++;
			System.out.println();
			}
		}
		
		
		
		
		
		

	}

}
