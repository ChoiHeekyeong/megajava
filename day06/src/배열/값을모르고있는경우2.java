package 배열;

import java.util.Scanner;

public class 값을모르고있는경우2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int[] data = new int[5];
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println("숫자 입력>> ");
			data[i] = sc.nextInt();
			sum = sum + data[i];
		}
		
		System.out.println("SUM = " + sum);//비파괴형
		double ave = (double)sum/data.length;//(double)는 강제로 타입을 바꿔주는 것 ----비파괴형
		System.out.println("AVE = " + ave);
		
		
		
		
		
		
		
	}

}
