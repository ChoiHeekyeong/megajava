package ������;

import javax.swing.JOptionPane;

public class �����Ǻ� {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		String age = JOptionPane.showInputDialog("���̸� �Է��ϼ���"); //���� Ÿ���� int�� �� ����.�׻� String. //�˾�â�� �Է��ϸ� ������ ���ڿ��� ���� �� �� ���⶧��.
		int age2 = Integer.parseInt(age); //��Ʈ���� ��Ʈ�� �ٲ�.
		

		/*
		 JOptionPane.showMessageDialog(null, "����� �̸��� "+name);//null�ڸ��� �θ��ڸ�. (�θ�: ������� â�� �����)
		 */
		
		if(age2>=18) {
			JOptionPane.showMessageDialog(null, name+"���� �����Դϴ�.");
		}
		else {
			JOptionPane.showMessageDialog(null, name+"���� ������ �ƴմϴ�.");
		}
		
		
	}

}
