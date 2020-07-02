package 인터페이스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우2 extends JFrame {
	JButton b1, b2, b3;

	public 윈도우2() {
		setTitle("나의 윈도우");
		setSize(300, 300);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		b1 = new JButton("버튼1");
		b2 = new JButton("버튼2");
		b3 = new JButton("버튼3");

		add(b1);
		add(b2);
		add(b3);
		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(new Font("굴림",Font.ITALIC,60)); //한번만 쓸거면 이렇게해도됨
		
		//익명클래스를 가지고 객체 생성
		//인터페이스는 객체 생성 불가!
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b1을 호출함");
			}
		});


		//b2.addActionListener(this);
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b2을 호출함");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("b3을 호출함");
				
			}
		});
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new 윈도우2(); // 익명!
	}


}
