package 인터페이스;

public class AppleCar implements Car {

	@Override //재정의
	public void speedUp() {
		System.out.println("속도를 업");

	}

	@Override
	public void speedDown() {
		System.out.println("속도를 다운");

	}

	@Override
	public void stop() {
		System.out.println("stop");

	}

}
