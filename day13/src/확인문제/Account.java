package Ȯ�ι���;

public class Account {

	String no;
	String name;
	int money;
	
	//��ü ������ �ڵ� ȣ��Ǵ� �޼ҵ�: ������ �޼ҵ�
	//�޼ҵ��� �Է°��� ���� �޼ҵ尡 ȣ��ȴ�.
	//�Ķ���Ͱ� �ִ� �����ڸ� ���������� ��ü������ �ݵ�� �ʿ��� ������ ������ �� �ִ�.
	public Account(String no, String name, int money) {
		this.no = no;
		this.name = name;
		this.money = money;
	}

	//��������� ���� ���� ���� �����ڸ� ���!
	//��� ������ ���� ����� ���� toString�� ���!
	
	
	
	@Override
	public String toString() {
		return "Account [���¹�ȣ=" + no + ", ������=" + name + ", �ʱⰪ=" + money + "]";
	}
	
	
	
	
	
	

}
