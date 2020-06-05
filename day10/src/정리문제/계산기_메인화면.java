package 정리문제;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 계산기_메인화면 {
	static int result;
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("나의 메인화면");
		// f와 f2는 같다.
		// JFrame f2 = new JFrame("나의 메인화면");
		f.setSize(500, 500);

		JLabel label = new JLabel();
		label.setText("결과: " + result);
		JButton b1 = new JButton("더하기");
		JButton b2 = new JButton("빼기");

		FlowLayout flow = new FlowLayout();

		f.setLayout(flow);
		f.add(b1);
		f.add(b2);
		f.add(label);

		Font font = new Font("굴림", Font.BOLD, 100);
		b1.setFont(font);
		b2.setFont(font);
		label.setFont(font);
		b1.setBackground(Color.GREEN);
		b2.setBackground(Color.yellow);

		f.setVisible(true);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				계산기 cal = new 계산기();
				result = cal.add(300, 200);
				label.setText("결과:"+result);
				JOptionPane.showMessageDialog(f, "더한 값은 "+result);
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				계산기 cal = new 계산기();
				result = cal.minus(300, 200);
				label.setText("결과:"+result);
				JOptionPane.showMessageDialog(f, "뺀 값은 "+result);
			}
		});

	}

}
