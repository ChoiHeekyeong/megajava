package »ó¼Ó;

public class MyThread2 {

	public static void main(String[] args) {

		Increase inc = new Increase();
		Decrease dec = new Decrease();
		
		inc.start();
		dec.start();
		
		
	}

}
