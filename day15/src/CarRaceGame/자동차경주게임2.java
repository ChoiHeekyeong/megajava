package CarRaceGame;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ���2 extends JFrame {

	public �ڵ������ְ���2(){
		setTitle("�ڵ������ְ���");
		setSize(600,400);
		
		//3���� ������ ��ü ���� start()
		MyThread car1 = new MyThread("�ڵ���1",100,0);
		MyThread car2 = new MyThread("�ڵ���2",100,50);
		MyThread car3 = new MyThread("�ڵ���3",100,100);
		
		car1.start();
		car2.start();
		car3.start();
		
		
		
		setLayout(null);
		getContentPane().setBackground(Color.pink);
		setVisible(true);
	}
	
	public class MyThread extends Thread{
		int x,y;
		ImageIcon icon;
		JLabel label;
		
		public MyThread(String name, int x, int y) {
			this.x = x;
			this.y = y;
			//icon = new ImageIcon(file);
			label = new JLabel(name);
			label.setBounds(x, y, 100, 100);//��ġ����
			add(label);
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 200; i++) {
				//0~0.99999
				x += 10 * Math.random();
				System.out.println("����� x�� ��ǥ:"+x);
				label.setBounds(x, y, 100, 100);
				
				
				if(x>=500) {
					label.setForeground(Color.red);
					break;
				}
				
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
			}
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		 new �ڵ������ְ���2();//�͸�Ŭ����..
		 
		 
		
		
		
	}

}
