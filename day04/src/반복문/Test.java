package �ݺ���;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		//�� ���� �Է� �޾Ƽ� ���� �� ū��?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n1�� ���� �Է��ϼ���: ");
		int n1 = sc.nextInt();
		System.out.print("n2�� ���� �Է��ϼ���: ");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("n1���� �� Ů�ϴ�");
		}
		else if(n1<n2) {
			
			System.out.println("n2���� �� Ů�ϴ�");
		}
		else {
			System.out.println("�� ���� �����ϴ�");
		}
		
		
		//����� �����ϴ� ������?
		System.out.println("����� �����ϴ� ������?");
		String data = sc.next(); //�Ѵܾ ������. ������ �ν��ع���. �� ���� �� ������������ nextLine()�� ����Ѵ�. �̰� �������� ���� x
		
		switch (data) {
		case "�ڹ�":
			System.out.println("JSP�� ����!");
			break;
		case "���̽�":
			System.out.println("���� ����!");
			break;
		default:
			System.out.println("������ ������!!");
			break;
		}
		
		
		
		
		
	}
	
	
	
	
	
	

}
