package 인터페이스;

public interface 테슬라우주선 extends 우주선, Airplane {
	//인터페이스는 인터페이스들을 상속 받을 수 있다
	public abstract void jump(); //public abstract는 디폴트값이라 안써줘도 사실 상관 없음
	
	public final String NAME = "테슬라"; //변수는 상수만 쓸 수 있음
	
	
}
