package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class �����߿�1��ã�� {

	public static void main(String[] args) {
		Random r = new Random(55);
		int[] student = new int[10000];
		for (int i = 0; i < student.length; i++) {
			student[i] = r.nextInt(401);//0~400��
		}
		
		//�ִ밪 ã��
		Arrays.sort(student); //student�� ��Ʈ.(������������ ����) //�ı��� �Լ�.
		for (int x : student) {
			System.out.println(x);
			
		}
		
		System.out.println("�ְ�������: "+student[9999]); //������ �ı��� �Լ��� �����Ƿ� �迭������ �ٲ�����. ���� �׳� �� �������� ����ϸ� ���� ū ���ڰ� ���´�.

		
		//Arrays.sort(student)�� ���� �迭 ������ �ı��Ǿ 1���� �������� ã�� �� ����.
		
	}

}
