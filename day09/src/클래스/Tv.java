package Ŭ����;

public class Tv {
	//������� , ��������(�ڵ��ʱ�ȭ)
	int ch;
	boolean onOff;
	
	//��ü�����ɶ� �ڵ����� ȣ��(call)�Ǵ� �޼ҵ�. (class�̸��� �Ȱ���!) = ������ (�޼ҵ�)
	public Tv(int x, boolean y) { //����Ʈ�� void�� ���� �Ƚ���
		ch = x;
		onOff = y;
		
	}
	
	
	//����޼ҵ�
	public void on() {
		System.out.println("Ƽ�� �Ѵ�");
		
	}
	
	public void off() {
		System.out.println("Ƽ�� ����");
		
	}
	
	//������ (override, �������̵�) - �����ִ��� �������ϸ� ���� �������Ѱ� �켱�̾�.
	public String toString() {
		return "ä����"+ch+", ������ "+onOff;
	}
	
	
	
}
