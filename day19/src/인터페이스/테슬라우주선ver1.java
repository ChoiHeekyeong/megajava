package 인터페이스;

public class 테슬라우주선ver1 implements 테슬라우주선 {

	@Override
	public void space() {
		System.out.println("화성을 탐사하다");
	}

	@Override
	public void fly() {
		System.out.println("여객 2000명을 태우다");
	}

	@Override
	public void jump() {
		System.out.println("높이 솟아오르다");

	}

}
