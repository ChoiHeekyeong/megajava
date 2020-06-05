package 생성자;

import java.util.Date;

public class 계산기사용 {

	public static void main(String[] args) {

		계산기 cal = new 계산기();
		//메소드 오버로딩시 구분은 입력값으로 한다.
		//타입,순서,개수도 중요!
		
		
		int result1 = cal.add(1,2);
		System.out.println(result1);
		double result2 = cal.add(200,200.2);
		System.out.println(result2);
		double result3 = cal.add(1.5,2.9999);
		System.out.println(result3);
		String result4 = cal.add(1,"원");
		System.out.println(result4);
		String result5 = cal.add("나는 ","최고");
		System.out.println(result5);
		int[] result6 = cal.add();
		for (int x : result6) {
			System.out.println(x);
		}
		Date result7 = cal.add(1000);
		System.out.println(result7.getHours());
		
		
		
	}

}
