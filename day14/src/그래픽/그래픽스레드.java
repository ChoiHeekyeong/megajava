package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �׷��Ƚ����� extends JFrame {
	JLabel l1, l2, l3;// ��������

	public �׷��Ƚ�����() {// static�� ����

		setTitle("������ ���α׷���");
		setSize(800, 300);

		l1 = new JLabel("1");
		l2 = new JLabel();
		l3 = new JLabel("3");

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		add(l1);
		add(l2);
		add(l3);

		Font font = new Font("�ü�", 1, 40);
		l1.setFont(font);
		l3.setFont(font);

		getContentPane().setBackground(Color.pink);

//		ImageIcon icon = new ImageIcon("3.png");
//		l2.setIcon(icon);

		ī���� counter = new ī����();
		�ð� time = new �ð�();
		�̹��� image = new �̹���();
		counter.start();
		time.start();
		image.start();
		setVisible(true);

	}

	// inner class
	public class ī���� extends Thread {

		@Override
		public void run() {
			for (int i = 500; i >= 0; i--) {

				l1.setText("ī����: " + i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

		}

	}

	public class �ð� extends Thread {
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();// ���� ��¥�� �ð��� �˷���
				l3.setText("����: " + date);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
	}

	public class �̹��� extends Thread {

		String[] img = { "1.png", "2.png", "3.png", "4.png", "5.png" };

		@Override
		public void run() {
			for (int i = 1; i < 6; i++) {
				ImageIcon icon = new ImageIcon(i + ".png");
				l2.setIcon(icon);
				
				//�̹��� �ݺ� ��ȭ
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

		�׷��Ƚ����� m = new �׷��Ƚ�����();

	}

}
