package Ŭ����;

public class ����_�������ް�� {

	public static void main(String[] args) {
		���� cal = new ����();
		
		//�̹��� ���� �ݾ�
		int count = 5;//������
		int salary = 1000000;//����
		
		int result1 = cal.mul(count,salary);
		
		
		
		//������ ���� �ݾ�
		int count2 = 8;
		int salary2=1200000;
		int result2 = cal.mul(count2, salary2);
		
		
		//�� �ް� ������ ������ ����ϰ�ʹ�.
		int result3 = cal.add(result1, result2);
		
		if (result3>=13000000) {
			System.out.println("������ �ʹ� ũ����.");
		}
		else {
			System.out.println("������ �����մϴ�.");
		}
		
		
		
		
	}

}
