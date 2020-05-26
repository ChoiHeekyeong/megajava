package 배열;

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("입력>> ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==33) {
				System.out.println("33은 "+(i+1)+"번째 위치에 있다.");
			}
		}
		
		
	}

}
