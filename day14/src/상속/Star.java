package ���;

public class Star extends Thread{ //Thread�� ��ӹ����Ƿν� �����尡�ȴ�
	
	@Override
	public void run() {
//		super.run();//super = �θ�Ŭ����(������)
		//������ ó���ϰ� ���� �κ���  �ڵ�.
		for (int i = 0; i < 100; i++) {
			System.out.println("��");
		}
		
	}
	

}
