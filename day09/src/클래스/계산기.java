package 클래스;

public class 계산기 {
	//동작: 멤버메소드
	
	//더하기, 곱하기
	public int add(int x, int y) {
		
		int result = x+y;
		System.out.println("두 수를 더한 결과: "+result+"won");
		return result;
	}
	public int mul(int x, int y) {
		
		int result = x*y;
		System.out.println("두 수를 곱한 결과: "+result+"won");
		//리턴
		return result;
	}
	
	
	
	
}
