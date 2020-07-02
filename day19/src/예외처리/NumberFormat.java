package 예외처리;

public class NumberFormat {

	public static void main(String[] args) {

		String n1 = "100세"; //숫자로 바꿀 수 없음
		int n2 = Integer.parseInt(n1);
		System.out.println(n2 + 1);
		
	}

}
