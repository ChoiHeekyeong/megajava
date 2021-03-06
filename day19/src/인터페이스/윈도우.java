package 인터페이스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 extends JFrame implements ActionListener {
	JButton b1, b2;

	public 윈도우() {
		setTitle("나의 윈도우");
		setSize(300, 300);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b1 = new JButton("버튼1");
		b2 = new JButton("버튼2");

		add(b1);
		add(b2);
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);


		b1.addActionListener(this);
		b2.addActionListener(this);//this => 이 클래스에 메소드가 있다는 뜻
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new 윈도우(); // 익명!
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("b1 버튼을 눌렀음");

		}
		if (e.getSource() == b2) {
			System.out.println("b2 버튼을 눌렀음");
		}

	}
}
