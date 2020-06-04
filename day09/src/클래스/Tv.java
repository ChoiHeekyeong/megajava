package 클래스;

public class Tv {
	//멤버변수 , 전역변수(자동초기화)
	int ch;
	boolean onOff;
	
	//객체생성될때 자동으로 호출(call)되는 메소드. (class이름과 똑같음!) = 생성자 (메소드)
	public Tv(int x, boolean y) { //디폴트가 void라 따로 안써줌
		ch = x;
		onOff = y;
		
	}
	
	
	//멤버메소드
	public void on() {
		System.out.println("티비를 켜다");
		
	}
	
	public void off() {
		System.out.println("티비를 끄다");
		
	}
	
	//재정의 (override, 오버라이딩) - 원래있던걸 재정의하면 내가 재정의한게 우선이야.
	public String toString() {
		return "채널은"+ch+", 전원은 "+onOff;
	}
	
	
	
}
