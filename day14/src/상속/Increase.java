package 상속;

public class Increase extends Thread{
	
	@Override
	public void run() {
	//	super.run();
		
		for (int i = 1; i <= 1000; i++) {
			System.out.println("증가-----"+i);
		}
		
		
		
	}

	
}
