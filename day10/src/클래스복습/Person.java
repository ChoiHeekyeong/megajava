package Ŭ��������;

public class Person {

	public static void main(String[] args) {

		Car car = new Car("�ݰ����",150); //��ü������ Ŭ���� �̸��� ������ �޼ҵ�� �ڵ�ȣ���. //��ü������ �ݵ�� ���־���ϴ� �ʱ⼳���� �ϱ����� 

		System.out.println("����ӵ�:" + car.nowSpeed());
		car.speedUp(50);
		System.out.println("����ӵ�:" + car.nowSpeed());
		car.speedDown();
		
		System.out.println(car);
	}

}
