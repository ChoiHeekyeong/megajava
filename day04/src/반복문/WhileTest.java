package �ݺ���;

import javax.swing.JOptionPane;

public class WhileTest {
	public static void main(String[] args) {

		
		int count=10;
		while (count<16) {
			System.out.println(count);
			count++;
			//count = count+1;
		}
		
		System.out.println("------------------------");
		
		
		while(true) {
			String hour = JOptionPane.showInputDialog("���� ��ÿ���? (����: x)");
			//x�� �������� Ȯ���ؾ���.
			//x�� ��������, �׸� �ݺ����� ������ �ʹ�.
			if(hour.equals("x")) {
				System.out.println("�ý����� �����մϴ�.");
				break;
				
			}
			System.out.println(hour+"�� �Դϴ�");//+<----���տ����� (�ϳ��� ��Ʈ���� ����������.)
		}
		
		
		
		
		
		
	}

}
