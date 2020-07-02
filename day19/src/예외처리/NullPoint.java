package 예외처리;

public class NullPoint {

	public static void main(String[] args) {
//		String name; //지역변수, 초기화되지 않음.
		String name = null;
		System.out.println(name.charAt(0)); //인덱스0번의 글자를  부르기 => null이므로 꺼내올 글자가 없음
		
	}

}
