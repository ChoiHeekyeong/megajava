package ���;

public class Decrease extends Thread{

	@Override
	public void run() {
//		super.run();
		for (int i = 1000; i >= 1; i--) {
			System.out.println("����====="+i);
		}
	}
}
