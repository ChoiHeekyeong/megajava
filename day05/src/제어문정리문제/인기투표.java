package �����������;

import java.util.Scanner;

public class �α���ǥ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int IU = 0; 
		int YOO = 0; 
		int BTS = 0; 
		while (true) {

			System.out.println("------------------------------");
			System.out.println("1.������ |2.���缮 |3.��ź�ҳ�� |4.����");
			System.out.println("------------------------------");

			System.out.print("����>> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				//IU = IU + 1;
				IU++;

			} else if (choice == 2) {
				//YOO =YOO+1;
				YOO++;
			} else if (choice == 3) {
				//BTS =BTS+1;
				BTS++;
				
			} else if (choice == 4) {
				System.out.println("�ý����� �����մϴ�.");
				System.out.println("<<���� ���>>");
				System.out.println("==========");
				System.out.println("������: "+IU+"ǥ");
				System.out.println("���缮: "+YOO+"ǥ");
				System.out.println("��ź�ҳ��: "+BTS+"ǥ");
				System.exit(0);// break;

			} else {
				System.out.println("�ٽ� �������ּ���.");
			}

		}

	}

}
