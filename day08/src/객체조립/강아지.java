package 객체조립;

public class 강아지 {
	
	//색, 이름 => 멤버변수, 선언의 변수의 생존 범위(전역변수)
	String color;
	String name;
	
	//짖다, 꼬리를 흔들다 =>멤버메소드(함수)
	public void bark() { //자바에서의 함수 생성
		System.out.println("강아지가 짖다.");
	}
	public void shake() {
		System.out.println("꼬리를 흔들다.");
	}
	

}
