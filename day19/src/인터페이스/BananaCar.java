package 인터페이스;

public class BananaCar implements Car {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("바나나카 업");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("바나나카 다운");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("바나나카 스탑");

	}

}
