package 반복문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 숫자판별하기 {

	public static void main(String[] args) {

		Random r = new Random(); // 숫자가 2개라고 이 문장을 두번 쓸 필요가 없음

		int count = 0;

		while (true) {
			
			String exit = JOptionPane.showInputDialog("종료할까요?:x, 계속할까요?:o");
			
			if(exit.equals("x")) {
				System.out.println("종료합니다. count:"+count);
				break;
			}
			
			
			
			int r1 = r.nextInt(100);
			int r2 = r.nextInt(100);
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
			
			count++;
			if (r1 > r2) {
				System.out.println("두 수 중 앞에 있는 숫자가 더 커요!");
				System.out.println(count + "회 만에 성공하셨습니다.");
				break;
			} else if (r1 < r2) {
				System.out.println("두 수 중 뒤에 있는 숫자가 더 커요!");
			} else {
				System.out.println("두 수가 같습니다.");
			}



		}

	}

}
