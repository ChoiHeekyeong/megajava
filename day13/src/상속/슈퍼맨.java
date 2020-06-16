package 상속;

public class 슈퍼맨 extends 맨 {
	// 변수3개, 메소드2개 갖고 시작

	boolean sky;

	public void space() {
		System.out.println(name + "이 우주를 날다");

	}

	//부모 메소드보다 자식클래스에서 오버라이드한게 우선임.!!!!!!!
	@Override
	public void run() {
//		super.run();//부모에있는 run()을 실행
		System.out.println("빛의 속도로 달리다");
	}
	
	@Override
	public String toString() {
		return "슈퍼맨 [sky=" + sky + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	
}
