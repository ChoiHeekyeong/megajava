package �ݺ���;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class �����Ǻ��ϱ� {

	public static void main(String[] args) {

		Random r = new Random(); // ���ڰ� 2����� �� ������ �ι� �� �ʿ䰡 ����

		int count = 0;

		while (true) {
			
			String exit = JOptionPane.showInputDialog("�����ұ��?:x, ����ұ��?:o");
			
			if(exit.equals("x")) {
				System.out.println("�����մϴ�. count:"+count);
				break;
			}
			
			
			
			int r1 = r.nextInt(100);
			int r2 = r.nextInt(100);
			System.out.println("r1 = " + r1);
			System.out.println("r2 = " + r2);
			
			count++;
			if (r1 > r2) {
				System.out.println("�� �� �� �տ� �ִ� ���ڰ� �� Ŀ��!");
				System.out.println(count + "ȸ ���� �����ϼ̽��ϴ�.");
				break;
			} else if (r1 < r2) {
				System.out.println("�� �� �� �ڿ� �ִ� ���ڰ� �� Ŀ��!");
			} else {
				System.out.println("�� ���� �����ϴ�.");
			}



		}

	}

}
