package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기 {

	public static void main(String[] args) {
		//아무 값이나 만들어주는 부품을 써보자.
		
		
		Random r = new Random(); //랜덤상수 생성
		int target = r.nextInt(100);// 얘는 인트!!!!! //()안에 100을 넣었으므로 0~99까지 생성.
		
		int count = 0;
		while (true) {
			count++;
		
			String data = JOptionPane.showInputDialog("숫자입력 (종료:x)");// 얘는 스트링 이므로 정수와 값을 비교할 수 없음.
			
			if(data.equals("x")) {
				System.out.println("x키로 종료합니다.");
				break;
			}
			
			int guess = Integer.parseInt(data);
			
			
			if(guess == target) {
				System.out.println("정답입니다!");
				System.out.println("당신의 시도 횟수는"+count+"회");
				System.out.println("시스템을 종료합니다.");
				break;
			}
			else {
				System.out.println("정답이 아닙니다.");
				
				
				//입력한 값이 정답보다 큰지 작은지 힌트주기
				if(guess>target) {
					System.out.println("입력한 값이 정답보다 큽니다.");
				}
				else {
					System.out.println("입력한 값이 정답보다 작습니다.");
				}
				
				
			}
			
			
		}

	}

}
