package �迭��ȭ;

import java.util.Random;

public class ����ä�����α׷� {

	public static void main(String[] args) {
		//4��������.
		
		//���� ���� �����
		int[] ���� = new int[1000];
		Random r = new Random(42);
		for (int i = 0; i < ����.length; i++) {
			����[i] = r.nextInt(4)+1; //0~3�� �ƴ϶� 1~4���� ������ �ؾ���
		}
		
		for (int i = 0; i < ����.length; i++) {
			System.out.println((i+1)+"�� ���� ��: "+ ����[i]);
		}
		
		
		System.out.println("============================");
		
		//�л��� �Ϻ� ��� �������� ����ֱ�
		int[] �л� = ����.clone();
		for (int i = 0; i < 300; i++) {
			int index = r.nextInt(300);
			int answer = r.nextInt(4)+1;
			�л�[index] = answer;
			
		}
		
		//� ������ Ʋ�ȴ��� ã�� ���װ� ����/��� �����
		int count = 0;
		for (int i = 0; i < ����.length; i++) {
			if (����[i] != �л�[i]) {
				System.out.println("Ʋ�� ���� : "+(i+1)+"�� ����, �л���: "+�л�[i]+" / ����: "+����[i]);
				count++;
			}
			
		}
		
		
		//�� ���� Ʋ�ȴ��� ã��.
		System.out.println("Ʋ�� ���� ����: "+count);
		
		//���� ����Ʈ (���� 1��)
		System.out.println("�л��� ����: "+(����.length-count)+"��");
		
		
		
	}

}
