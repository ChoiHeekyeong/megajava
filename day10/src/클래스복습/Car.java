package Ŭ��������;

public class Car {
	// Ư¡(������)
	// ������ =>�������, ��������(�ڵ��ʱ�ȭ�� �ȴ�)
	String wheel;// �������, null�� �ʱ�ȭ.
	int speed;// �ӵ�, 0���� �ʱ�ȭ.

	
	
	
	//Source > Generate Constructor Using FieldŬ���Ͽ�����
	public Car(String wheel, int speed) {
		super();
		this.wheel = wheel;
		this.speed = speed;
	}

	/*
	//��ü������ �ڵ� ȣ��Ǵ� �޼ҵ带 ���鿹��, = ������ �޼ҵ�.
	public Car(String wheel, int speed) {
		//������ �޼ҵ�� ��ȯ�� ǥ������ �ʴ´�. �ʱ⼳���� �ϱ����� �ֱ⶧��. ��δ� void
		this.wheel = wheel;
		this.speed = speed;
	}
	*/
	
	
	// ������=>����޼ҵ�(�Լ�), �Է°��� ��ȯ���� ���.
	public void speedUp(int speed) {
		this.speed = this.speed + speed;
		System.out.println(this.speed+"�� ���ǵ��!");
	}

	public int nowSpeed() {

		return speed;
	}

	public void speedDown() {
		System.out.println("���ǵ� �ٿ�!");
	}

	@Override //�������̵�, ����� ������
	public String toString() {
		return "�ڵ��� [����=" + wheel + ", �ӵ�=" + speed + "]";
	}

	
	

}
