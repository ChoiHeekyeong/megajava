package 복습;

import java.awt.Color;

public class MyRoom {

	public static void main(String[] args) {
		Tv myTv = new Tv(7,9,true);
		Tv yourTv = new Tv(9,12,true);
		
		
		System.out.println(myTv);
		System.out.println(yourTv);
		
	
		for (int i = 0; i < 100; i++) {
			Tv tv = new Tv(1,1,true);
		}
		System.out.println(myTv.channel);
		System.out.println(yourTv.channel);
		System.out.println("객체생성 개수는 "+Tv.count);
		
	}

}
