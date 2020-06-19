package CarRaceGame;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 자동차경주게임2 extends JFrame {

	public 자동차경주게임2(){
		setTitle("자동차경주게임");
		setSize(600,400);
		
		//3개의 스레드 객체 만들어서 start()
		MyThread car1 = new MyThread("자동차1",100,0);
		MyThread car2 = new MyThread("자동차2",100,50);
		MyThread car3 = new MyThread("자동차3",100,100);
		
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
			label.setBounds(x, y, 100, 100);//위치지정
			add(label);
		}
		
		@Override
		public void run() {
			for (int i = 0; i < 200; i++) {
				//0~0.99999
				x += 10 * Math.random();
				System.out.println("변경된 x축 좌표:"+x);
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
		 new 자동차경주게임2();//익명클래스..
		 
		 
		
		
		
	}

}
