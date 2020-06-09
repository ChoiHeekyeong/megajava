package 정적멤버;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count; // 0으로 초기화

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300); // 일반메소드<->스태틱메소드, 일반메소드는 반드시 객체 생성 후 객체의 주소로 접근해서 사용!

		JLabel number = new JLabel("0");

		JButton b1 = new JButton("1더하기");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1빼기");

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);

		Font font = new Font("궁서", Font.BOLD, 150);
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
