package 클래스;

public class 컴퓨터 {
	//컴퓨터 각 비용을 더하다.(모니터가격,본체가격)
	public int compute(int x, int y) {
		int result = x+y;//모니터 가격+ 본체가격
		System.out.println("컴퓨터 각 비용은 "+result+"원");
		return result;
	}
	
	
	
	
	//컴퓨터 구입 비용을 계산하다.(컴퓨터대수,비용)
	public void total(int x, int y) {
		int result = x * y; //비용*컴퓨터대수
		System.out.println("컴퓨터 총 구입 비용은 "+result+"원");
		
	}
	
	
}
