package �迭����;

public class �迭�⺻ {

	public static void main(String[] args) {
		//1. �迭�� ����� ���� ���� ���� �����͸� �̹� �����͸� �˰��ִ� ���
		String[] food = {"������","��ī��","��â"};
		
		//�迭�� ���� Ÿ�Ը� ���� �� �ִ�.
		//Object[] p = {"d",1}; //�����͵��� Ÿ���� �޶� �� �� �ִ� �迭������ ����õ..
		
		food[0]="ġ������ũ";
		
		//for
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		//for-each
		for (String x : food) {
			System.out.println(x);
		}
		
		
		
		//2. �迭�� ����� ���� ���� ���� �����͸� �����͸� �𸣰� �ִ� ���
		String[] doing = new String[3];
		doing[0]="ȸ����";
		doing[1]="������";
		doing[2]="���డ";
		
		for (String x : doing) {
			System.out.println(x);
			
		}
		
		
		
		for (int i = 0; i < doing.length; i++) {
			if(doing[i]=="������") {
				System.out.println(i);
			}
		}
		
		

	}

}
