package Ŭ����;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class �ϱ��� {

	public static void main(String[] args) throws Exception {
		//�Է¹ޱ�
		String day = JOptionPane.showInputDialog("��¥�Է�");
		String title = JOptionPane.showInputDialog("�����Է�");
		String content = JOptionPane.showInputDialog("�����Է�");
		
		//��ġ �����ؼ� ����.
		
//		File file = new File("c:/imsi"); //()�ȿ� ��ġ.
//		System.out.println("������ ������? "+ file.exists()); //������ �����ϴ��� Ȯ��.
		
		FileWriter file = new FileWriter("c:/imsi/"+day+".txt"); //�ش���ġ�� �ش� ���� �����ϴ� ��ǰ 
		file.write("day: " + day + "\n");
		file.write("title: " + title + "\n");
		file.write("content: "+ content + "\n");
		file.close();//�̰� ����� ���ϳ����Է��� �����ٴ� �� ��ǻ�Ͱ� �˾�����.. �Ⱦ��� ������ �Է��̾ȵ�
		
		
		
		
		
	}

}
