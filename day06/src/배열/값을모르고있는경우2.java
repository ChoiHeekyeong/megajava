package �迭;

import java.util.Scanner;

public class �����𸣰��ִ°��2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int[] data = new int[5];
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			System.out.println("���� �Է�>> ");
			data[i] = sc.nextInt();
			sum = sum + data[i];
		}
		
		System.out.println("SUM = " + sum);//���ı���
		double ave = (double)sum/data.length;//(double)�� ������ Ÿ���� �ٲ��ִ� �� ----���ı���
		System.out.println("AVE = " + ave);
		
		
		
		
		
		
		
	}

}
