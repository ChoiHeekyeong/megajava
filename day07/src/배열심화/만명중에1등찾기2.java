package �迭��ȭ;

import java.util.Arrays;
import java.util.Random;

public class �����߿�1��ã��2 {

	public static void main(String[] args) {
		
		Random r = new Random(55);
		int[] student = new int[10000];
		for (int i = 0; i < student.length; i++) {
			student[i] = r.nextInt(401);//0~400��
		}
		
		//�����ı��� ���� �ʰ� �ִ밪 ã��.
		
		int max = student[0]; //max�� �켱 �迭 ù��° ������ �ʱ�ȭ
		//��ü ������ ���鼭
		//���� üũ: max�� �־�� ������ ū��?
		//���� max���� ũ�ٸ� max�� �� ���� �ִ´�.
		for (int i = 0; i < student.length; i++) {
			if(max < student[i]) {
				max = student[i];
			}
		}
		
		System.out.println("MAX = "+max);
		int count = 0;
		System.out.print("�ְ��� ���� �л���: ");
		for (int i = 0; i < student.length; i++) {
			if (student[i] == max) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("max���� ���� �л� ��: "+count);
		
		
		
	}
		
		
}
