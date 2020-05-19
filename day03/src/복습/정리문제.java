package 복습;

public class 정리문제 {

	public static void main(String[] args) {
		//정수
		int hour = 7;
		//실수
		double min = 0.49;
		//문자
		char day = '화';
		//논리
		boolean food = true;
		
		System.out.println("지금 시각은 "+hour+"시 ");
		System.out.println("지금 분은 "+min*100);
		System.out.println("지금 요일은 "+day);
		System.out.println("식사여부는 "+food);
		//.은 접근기호
		
		
		
		
		//기본형 이외의 것
		String name="홍길동";
		
		int num1 = 200;
		int num2 = 100;
		
		System.out.println(num1==num2);
		
		String n1="홍길동";
		String n2="박길동"; //위처럼 비교불가. 기본형이 아니기 때문!!
		System.out.println(n1.equals(n2));
		
		if (n1.equals(n2)) {
			System.out.println("두 이름이 같다");
			
		}
		else {
			System.out.println("두 이름이 다르다");
		}
		
		
		
		
		
	}

}
