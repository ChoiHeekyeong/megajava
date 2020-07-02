package 인터페이스;

public class BananaCom implements Computer {

	@Override
	public void cal() {
		System.out.println("Banana 컴퓨터가 계산을 하다");

	}

	@Override
	public void internet() {
		System.out.println("Banana 컴퓨터가 인터넷을 서비스하다");

	}

}
