package ������;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class �׷��� {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("���� ��ư");
		JLabel l = new JLabel("���� ��");
		JTextField t = new JTextField(10);
		
		//������
		//�θ�Ŭ����Ÿ���� �� �� �ִ� �ڸ��� �ڽ�Ŭ������ �� �� �� �ִ�.
		//�θ��� �̸����� ������ �صθ�, �ڽ��� �̸����� ������� ��ü�� �� ������� �� �ִ�.
		f.add(b);
		f.add(l);
		f.add(t);
		
		
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		
	}

}
