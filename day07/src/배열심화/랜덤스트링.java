package 배열심화;

import java.util.Random;

public class 랜덤스트링 {

	public static void main(String[] args) {
		String[] food = {"감자", "고구마","양파","피자","치킨"};
		Random r = new Random();
		int index =r.nextInt(5);//0~4
		
		System.out.println("랜덤으로 뽑은 음식은 "+food[index]);
		
		
		
	}

}
