package 상속;

import java.util.Date;

public class 시각스레드 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i <500; i++) {
			Date date = new Date();//현재 날짜와 시간을 알려줌
			System.out.println("현재: "+date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}
}
