package �迭��ȭ;

import java.util.Random;

public class ������Ʈ�� {

	public static void main(String[] args) {
		String[] food = {"����", "����","����","����","ġŲ"};
		Random r = new Random();
		int index =r.nextInt(5);//0~4
		
		System.out.println("�������� ���� ������ "+food[index]);
		
		
		
	}

}
