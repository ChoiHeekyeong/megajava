package �迭;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�Է�>> ");
			arr[i] = sc.nextInt();
			sum = sum + arr[i];
		}
		System.out.println("SUM = " + sum);

	}

}
