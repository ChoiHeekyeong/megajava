package ���;

public class ���۸� extends �� {
	// ����3��, �޼ҵ�2�� ���� ����

	boolean sky;

	public void space() {
		System.out.println(name + "�� ���ָ� ����");

	}

	//�θ� �޼ҵ庸�� �ڽ�Ŭ�������� �������̵��Ѱ� �켱��.!!!!!!!
	@Override
	public void run() {
//		super.run();//�θ��ִ� run()�� ����
		System.out.println("���� �ӵ��� �޸���");
	}
	
	@Override
	public String toString() {
		return "���۸� [sky=" + sky + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}

	
}
