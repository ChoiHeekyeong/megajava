package 배열;

import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		String[] arr = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("입력>> ");
			arr[i] = sc.next();
		}
		
		System.out.println("**"+arr[0]+"보다는 "+arr[1]+"**");
		
	}

}
