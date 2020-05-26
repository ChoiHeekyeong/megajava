package 배열;

import java.util.Random;

public class 랜덤한값1000개넣기 {

	public static void main(String[] args) {
		Random r = new Random(42);//seed값을 넣어주면 매번 바뀌지않음
		
		int[] num = new int[1000];//주소는 8바이트 .length는 4바이트
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);//0~999까지의 숫자만 랜덤발생.
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
