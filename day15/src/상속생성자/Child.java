package ��ӻ�����;

public final class Child extends Parent{

	@Override
	void tv() {
//		super.tv();
		System.out.println("���ѵ����� ����");
	}
	
	void together() {
		tv();//���� Ƽ�񸦺���
		super.tv();//�θ���� Ƽ�� ���Ŵ�
		
	}
	

	
}
