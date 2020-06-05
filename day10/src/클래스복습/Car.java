package 클래스복습;

public class Car {
	// 특징(응집도)
	// ㄴ성질 =>멤버변수, 전역변수(자동초기화가 된다)
	String wheel;// 바퀴모양, null로 초기화.
	int speed;// 속도, 0으로 초기화.

	
	
	
	//Source > Generate Constructor Using Field클릭하여생성
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}

	/*
	//객체생성시 자동 호출되는 메소드를 만들예정, = 생성자 메소드.
	public Car(String wheel, int speed) {
		//생성자 메소드는 반환을 표기하지 않는다. 초기설정을 하기위해 있기때문. 모두다 void
		this.wheel = wheel;
		this.speed = speed;
	}
	*/
	
	
	// ㄴ동작=>멤버메소드(함수), 입력값과 반환값을 고려.
	public void speedUp(int speed) {
		this.speed = this.speed + speed;
		System.out.println(this.speed+"로 스피드업!");
	}

	public int nowSpeed() {

		return speed;
	}

	public void speedDown() {
		System.out.println("스피드 다운!");
	}

	@Override //오버라이딩, 기능을 재정의
	public String toString() {
		return "자동차 [바퀴=" + wheel + ", 속도=" + speed + "]";
	}

	
	

}
