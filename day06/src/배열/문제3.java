package �迭;

import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		int[] arr = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�Է�>> ");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==33) {
				System.out.println("33�� "+(i+1)+"��° ��ġ�� �ִ�.");
			}
		}
		
		
	}

}
