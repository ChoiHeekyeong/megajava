package �������̽�;

public class AppleCar implements Car {

	@Override //������
	public void speedUp() {
		System.out.println("�ӵ��� ��");

	}

	@Override
	public void speedDown() {
		System.out.println("�ӵ��� �ٿ�");

	}

	@Override
	public void stop() {
		System.out.println("stop");

	}

}
