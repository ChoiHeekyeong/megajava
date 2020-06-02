package Ŭ����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ��ȭ�ٹ� {

	static int now = 2; // �迭�� ���� ��ġ�� �˷��ִ� ����

	public static void main(String[] args) {
		// ��ȭ �̹��� �迭 ����
		String[] list = { "002.png", "003.png", "004.png", "005.png", "006.png" };
		//��ȭ �̸� �迭 ����
		String[] title = {" ������� ","������ �̽�������","������ ���","ī�� ������ũ","�̽������̺��"};
		
		// ������
		JFrame f = new JFrame();
		// ���̶�
		JLabel label1 = new JLabel();//���� �ִ� ��
		JLabel label2 = new JLabel();//��ȭ���� �ִ� ��
		// �÷ο췹�̾ƿ�
		FlowLayout flow = new FlowLayout();
		// ���̹�ư
		JButton left = new JButton("<<<<");
		JButton right = new JButton(">>>>");

		f.setSize(300, 550);
		f.setLayout(flow);

		f.add(label1);
		f.add(label2);
		f.add(left);
		f.add(right);

		// img������
		ImageIcon icon = new ImageIcon(list[now]);
		label1.setIcon(icon);
		label2.setText(title[now]);
		
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(now>0) { //1~4������ 1�� ���� ���ְ�!
					now--;// ���꿡�� �������� now������ main�ۿ� static���� �������
				}
				else {
					now = 4;
				}
				ImageIcon icon = new ImageIcon(list[now]);
				label1.setIcon(icon);
				label2.setText(title[now]);
			}
		});

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(now<4) {
					now++;
				}
				else {
					now = 0;
				}
				ImageIcon icon = new ImageIcon(list[now]);
				label1.setIcon(icon);
				label2.setText(title[now]);
			}
		});

		// font
		Font font = new Font("�ü�", Font.BOLD, 50);
		Font font2 = new Font("�ü�", Font.BOLD, 20);
		label2.setFont(font2);
		left.setFont(font);
		right.setFont(font);
		left.setBackground(Color.YELLOW);
		right.setBackground(Color.YELLOW);
		left.setForeground(Color.red);
		right.setForeground(Color.blue);

		f.setVisible(true);

	}

}
