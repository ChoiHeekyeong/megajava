package ���;

public class MyThread {

	public static void main(String[] args) {
		Star star = new Star();
		Diamond diamond = new Diamond();
		
//		�̷����ϸ� ȣ���� ������� ������ ����. ���ÿ� �����϶�� cpu�� �˷��ִ� ����� �ƴ϶� �Ҹ�.
//		star.run();
//		diamond.run();
		
		//���ÿ� ó���϶�� �˷��ִ� �޼ҵ�� start
		star.start();
		diamond.start();
		
		
	}

}
