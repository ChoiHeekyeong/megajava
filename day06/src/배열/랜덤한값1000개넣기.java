package �迭;

import java.util.Random;

public class �����Ѱ�1000���ֱ� {

	public static void main(String[] args) {
		Random r = new Random(42);//seed���� �־��ָ� �Ź� �ٲ�������
		
		int[] num = new int[1000];//�ּҴ� 8����Ʈ .length�� 4����Ʈ
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);//0~999������ ���ڸ� �����߻�.
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + ": " + num[i]);
		}
		
		
		System.out.println("=============================");
		for (int i = 0; i < num.length; i++) {
			if(num[i]==492) {
				System.out.println("index: "+i);
				
			}
			
			
			
		}
		
		
		
		
	}

}
