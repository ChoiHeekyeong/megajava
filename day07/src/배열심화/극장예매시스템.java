package �迭��ȭ;

import java.util.Scanner;

public class ���忹�Žý��� {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] seat = new int[10];
		int count = 0;
		while (true) {
		System.out.println("-----------------------");
		for (int i = 0; i < seat.length; i++) {
			System.out.print(" "+(i+1));
		}
		System.out.println();
		System.out.println("-----------------------");	
		for (int i = 0; i < seat.length; i++) {
			System.out.print(" " + seat[i]);
		}
		
		
		System.out.println();
		System.out.println();
			System.out.print("�� �� �¼��� �����Ͻðڽ��ϱ�?(����:-1) >> ");
			int num = sc.nextInt();
			if(num == -1) {
				System.out.println("����� ���� �¼� ���� "+ count +"�� �Դϴ�");
				System.out.println("���Ÿ� �����մϴ�.");
				System.out.println("�� ���� �ݾ��� "+(count*10000)+"�� �Դϴ�.");
				break;
			}
			
			//�����ϱ� ���� �� �ڸ��� �̹� ���Ű� �� �ڸ����� Ȯ���ؾ� �Ѵ�.
			if(seat[num-1]==1) {
				System.out.println();
				System.out.println("���̹� ���Ű� �� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ��� �������ּ���.");
				System.out.println();
			}
			else {
			//����ó��
			seat[num-1] = 1;
			
			System.out.println("���Ű� �Ϸ� �Ǿ����ϴ�.");
			count++;
			System.out.println();
			}
		}
		
		
		
		
		
		

	}

}
