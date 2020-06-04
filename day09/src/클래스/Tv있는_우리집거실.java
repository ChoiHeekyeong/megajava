package 클래스;

public class Tv있는_우리집거실 {

	public static void main(String[] args) {
		
		Tv tv1 = new Tv(100,false); //지역변수(자동초기화 x)
		
//		tv1.ch=100;
//		tv1.onOff=false;
		tv1.on();
		System.out.println(tv1); //public String toString(){}
		
		Tv tv2 = new Tv(200,true);
		
//		tv2.ch=200;
//		tv2.onOff=true;
		tv2.off();
	}

}
