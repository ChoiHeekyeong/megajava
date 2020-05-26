package 배열;

public class 값을모르고있는경우 {
	
	public static void main(String[] args) {
		int[] num = new int[1000];
		System.out.println(num);//배열 num의 주소값
		System.out.println(num[0]);//위치값(index), 0부터시작
		num[500]=1;
		num[666]=1;
		System.out.println(num[500]);
		System.out.println(num[999]);//배열의 초기값은 0으로 다 들어있다. int->0,double->0.0
		/*
		int[] seat1 = {0,0,1,1,1,1,0};
		int[] seat2 = {0,1,0,1,1,1,1};
		int[] seat3 = {1,0,0,0,1,0,0};
		*/
		int[] seat = new int[21];
		//읽기 전용 변수: 배열의 개수
		System.out.println(seat.length);
		System.out.println(seat[0]==seat[2]);//==는 기본형만 쓸 수 있다. 그러므로 seat==seat[3]은 사용불가.
		seat[2]=1;
		seat[3]=1;
		seat[4]=1;
		seat[5]=1;
		
	
		
		for (int i = 0; i < seat.length; i++) {
			System.out.print(seat[i]+" ");
			
		}
		
		
		
		
		
		
		
	}

}
