package ��ü����;

public class ���� {

	public static void main(String[] args) {
		������ ��1 = new ������();
		������ ��2 = new ������();
		
		��1.color="Ȳ��";
		��1.name="�޸�";
		��1.bark();//�Լ� ��� //�޼ҵ带 �θ���(call, �޼ҵ� ��, ȣ��)
		��1.shake();
		System.out.println("�̸��� "+��1.name);
		System.out.println("������ "+��1.color);
		
		��2.color="������";
		��2.name="����";
		��2.bark();
		��2.shake();
		System.out.println("�̸��� "+��2.name);
		System.out.println("������ "+��2.color);
		
		��� ��1 = new ���();
		��1.age = 22;
		��1.name = "������";
		��1.read();
		��1.seat();
		System.out.println("�̸��� "+��1.name);
		System.out.println("���̴� "+��1.age);
		

	}

}
