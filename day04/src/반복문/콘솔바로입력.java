package �ݺ���;

import java.util.Scanner;

public class �ֹܼٷ��Է� {

	public static void main(String[] args) {
		
		
		//��ĳ��(�Է¿�, file, Ű����, ��Ʈ��ũ,,,,,)
		//string--> int ��ɾ ����������
		Scanner sc = new Scanner(System.in);//��� �Է��Ұ��� ()�ȿ� �˷������. 'System.in'=Ű����.
		
		System.out.print("����� ���̸� �Է����ּ���>> ");
		int age = sc.nextInt();//���� �������� �ȹٲ㵵 �ڵ����� int�� �ٲ㼭 �Էµ���.
		
		System.out.println("����� ���̴� "+age+"��.");
		System.out.println("����� ���� ���̴� "+(age+1)+"��.");
		

	}

}
