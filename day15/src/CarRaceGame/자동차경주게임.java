package CarRaceGame;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class �ڵ������ְ��� extends JFrame {

	public �ڵ������ְ���(){
		setTitle("�ڵ������ְ���");
		setSize(600,400);
		
		//3���� ������ ��ü ���� start()
		MyThread car1 = new MyThread("car1.gif",100,0);
		MyThread car2 = new MyThread("car2.gif",100,50);
		MyThread car3 = new MyThread("car3.gif",100,100);
		MyThread car4 = new MyThread("car1.gif",100,150);
		MyThread car5 = new MyThread("car2.gif",100,200);
		MyThread car6 = new MyThread("car3.gif",100,250);
		
		car1.start();
		car2.start();
		car3.start();
		car4.start();
		car5.start();
		car6.start();
		
		
		
		setLayout(null);
		setVisible(true);
	}
	
	public class MyThread extends Thread{
		int x,y;
		ImageIcon icon;
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			icon = new ImageIcon(file);
			label = new JLabel(icon);
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
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				
			}
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		 new �ڵ������ְ���();//�͸�Ŭ����..
		 
		 
		
		
		
	}

}
