package ��������;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ����_����ȭ�� {
	static int result;
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("���� ����ȭ��");
		// f�� f2�� ����.
		// JFrame f2 = new JFrame("���� ����ȭ��");
		f.setSize(500, 500);

		JLabel label = new JLabel();
		label.setText("���: " + result);
		JButton b1 = new JButton("���ϱ�");
		JButton b2 = new JButton("����");

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);
		f.add(b1);
		f.add(b2);
		f.add(label);

		Font font = new Font("����", Font.BOLD, 100);
		b1.setFont(font);
		b2.setFont(font);
		label.setFont(font);
		b1.setBackground(Color.GREEN);
		b2.setBackground(Color.yellow);

		f.setVisible(true);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				���� cal = new ����();
				result = cal.add(300, 200);
				label.setText("���:"+result);
				JOptionPane.showMessageDialog(f, "���� ���� "+result);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				���� cal = new ����();
				result = cal.minus(300, 200);
				label.setText("���:"+result);
				JOptionPane.showMessageDialog(f, "�� ���� "+result);
			}
		});

	}

}
