package 상속;

public class Star extends Thread{ //Thread를 상속받으므로써 스레드가된다
	
	@Override
	public void run() {
//		super.run();//super = 부모클래스(스레드)
		//스레드 처리하고 싶은 부분을  코딩.
		for (int i = 0; i < 100; i++) {
			System.out.println("★");
		}
		
	}
	

}
