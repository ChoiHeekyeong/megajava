package �迭��ȭ;

public class �迭��������_�������� {

	public static void main(String[] args) {
		int[] score1 = {100,88,96};
		int[] score2 = score1.clone();
		
		System.out.print("1�б� ���� ����: ");
		for (int i = 0; i < score2.length; i++) {
			System.out.print(score1[i]+" ");
		}
		System.out.println();
		
		//2�б� ���������� ù �л��� 100������ 99��
		score2[0] = 99;
		
		//�հ�� ��ձ��ϱ�
		int sum1 = 0;
		int sum2 = 0;
		double avg1 = 0;
		double avg2 = 0;
		for (int i = 0; i < score1.length; i++) {
			sum1 = sum1 + score1[i];
			sum2 = sum2 + score2[i];
		}
		avg1 = (double)sum1/score1.length;
		avg2 = (double)sum2/score2.length;
		
		System.out.println("1�б� ���� ���� ��: "+sum1+", 1�б� ���� ���� ���: "+avg1);
		System.out.println("2�б� ���� ���� ��: "+sum2+", 2�б� ���� ���� ���: "+avg2);
		
		
		
		if (avg1>avg2) {
			System.out.println("1�б� ����� �� ����");
		}
		else if(avg2>avg1){
			System.out.println("2�б� ����� �� ����");
			
		}
		else {
			System.out.println("�� �б� ����� ����.");
		}
		
		
		
		
	}

}
