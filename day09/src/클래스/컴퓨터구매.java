package 클래스;

public class 컴퓨터구매 {

	public static void main(String[] args) {
		//모니터 가격:20만원, 본체 가격:30만원, 구입대수 : 3대
		int moni = 200000;
		int bon = 300000;
		int count = 3;
		
		컴퓨터 com1 = new 컴퓨터();
		
		//한 대당 가격 계산
		int computer = com1.compute(moni, bon);
		
		
		//컴퓨터 총 구입 비용 계산
		com1.total(computer, count);
		
		
		
		
	}

}
