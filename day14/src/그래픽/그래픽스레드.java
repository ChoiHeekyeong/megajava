package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 그래픽스레드 extends JFrame {
	JLabel l1, l2, l3;// 전역변수

	public 그래픽스레드() {// static이 없음

		setTitle("스레드 프로그래밍");
		setSize(800, 300);

		l1 = new JLabel("1");
		l2 = new JLabel();
		l3 = new JLabel("3");

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		add(l1);
		add(l2);
		add(l3);

		Font font = new Font("궁서", 1, 40);
		l1.setFont(font);
		l3.setFont(font);

		getContentPane().setBackground(Color.pink);

//		ImageIcon icon = new ImageIcon("3.png");
//		l2.setIcon(icon);

		카운터 counter = new 카운터();
		시각 time = new 시각();
		이미지 image = new 이미지();
		counter.start();
		time.start();
		image.start();
		setVisible(true);

	}

	// inner class
	public class 카운터 extends Thread {

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {

				l1.setText("카운터: " + i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}

	}

	public class 시각 extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();// 현재 날짜와 시간을 알려줌
				l3.setText("현재: " + date);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public class 이미지 extends Thread {

		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };

		@Override
		public void run() {
			for (int i = 1; i < 6; i++) {
				ImageIcon icon = new ImageIcon(i + ".png");
				l2.setIcon(icon);
				
				//이미지 반복 변화
				if (i==5) {
					i=0;
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			
			
		}

	}

	public static void main(String[] args) {

		그래픽스레드 m = new 그래픽스레드();

	}

}
