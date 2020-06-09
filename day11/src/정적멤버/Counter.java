package �������;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count; // 0���� �ʱ�ȭ

	public static void main(String[] args) {
		JFrame f = new JFrame("���� ī���� ���α׷�");
		f.setSize(300, 300); // �Ϲݸ޼ҵ�<->����ƽ�޼ҵ�, �Ϲݸ޼ҵ�� �ݵ�� ��ü ���� �� ��ü�� �ּҷ� �����ؼ� ���!

		JLabel number = new JLabel("0");

		JButton b1 = new JButton("1���ϱ�");
		JButton b2 = new JButton("0���� �ʱ�ȭ");
		JButton b3 = new JButton("1����");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);

		Font font = new Font("�ü�", Font.BOLD, 150);
		number.setFont(font);
		number.setForeground(Color.red);

		b1.setBackground(Color.green);
		b3.setBackground(Color.green);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(String.valueOf(count));

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");

			}
		});

		f.setVisible(true);

	}

}
