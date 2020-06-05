package 클래스복습;

public class Person {

	public static void main(String[] args) {

		Car car = new Car("금관모양",150); //객체생성시 클래스 이름과 동일한 메소드는 자동호출됨. //객체생성시 반드시 해주어야하는 초기설정을 하기위해 

		System.out.println("현재속도:" + car.nowSpeed());
		car.speedUp(50);
		System.out.println("현재속도:" + car.nowSpeed());
		car.speedDown();
		
		System.out.println(car);
	}

}
