package �迭;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		String[] arr = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�Է�>> ");
			arr[i] = sc.next();
		}
		
		System.out.println("**"+arr[0]+"���ٴ� "+arr[1]+"**");
		
	}

}
