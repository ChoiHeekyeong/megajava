package �ݺ���;

import java.util.Random;

import javax.swing.JOptionPane;

public class ���ڸ��߱� {

	public static void main(String[] args) {
		//�ƹ� ���̳� ������ִ� ��ǰ�� �Ẹ��.
		
		
		Random r = new Random(); //������� ����
		int target = r.nextInt(100);// ��� ��Ʈ!!!!! //()�ȿ� 100�� �־����Ƿ� 0~99���� ����.
		
		int count = 0;
		while (true) {
			count++;
		
			String data = JOptionPane.showInputDialog("�����Է� (����:x)");// ��� ��Ʈ�� �̹Ƿ� ������ ���� ���� �� ����.
			
			if(data.equals("x")) {
				System.out.println("xŰ�� �����մϴ�.");
				break;
			}
			
			int guess = Integer.parseInt(data);
			
			
			if(guess == target) {
				System.out.println("�����Դϴ�!");
				System.out.println("����� �õ� Ƚ����"+count+"ȸ");
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
			else {
				System.out.println("������ �ƴմϴ�.");
				
				
				//�Է��� ���� ���亸�� ū�� ������ ��Ʈ�ֱ�
				if(guess>target) {
					System.out.println("�Է��� ���� ���亸�� Ů�ϴ�.");
				}
				else {
					System.out.println("�Է��� ���� ���亸�� �۽��ϴ�.");
				}
				
				
			}
			
			
		}

	}

}
