package �迭;

public class �����𸣰��ִ°�� {
	
	public static void main(String[] args) {
		int[] num = new int[1000];
		System.out.println(num);//�迭 num�� �ּҰ�
		System.out.println(num[0]);//��ġ��(index), 0���ͽ���
		num[500]=1;
		num[666]=1;
		System.out.println(num[500]);
		System.out.println(num[999]);//�迭�� �ʱⰪ�� 0���� �� ����ִ�. int->0,double->0.0
		/*
		int[] seat1 = {0,0,1,1,1,1,0};
		int[] seat2 = {0,1,0,1,1,1,1};
		int[] seat3 = {1,0,0,0,1,0,0};
		*/
		int[] seat = new int[21];
		//�б� ���� ����: �迭�� ����
		System.out.println(seat.length);
		System.out.println(seat[0]==seat[2]);//==�� �⺻���� �� �� �ִ�. �׷��Ƿ� seat==seat[3]�� ���Ұ�.
		seat[2]=1;
		seat[3]=1;
		seat[4]=1;
		seat[5]=1;
		
	
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+" ");
			
		}
		
		
		
		
		
		
		
	}

}
