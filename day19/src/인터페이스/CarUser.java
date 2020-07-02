package 인터페이스;

public class CarUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppleCar car = new AppleCar();
		car.speedUp();
		car.speedDown();
		car.stop();
		
		BananaCar car2 = new BananaCar();
		car2.speedUp();
		car2.speedDown();
		car2.stop();
	}

}
