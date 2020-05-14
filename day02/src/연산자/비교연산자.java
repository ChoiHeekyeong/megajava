package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		
		int num1 = 200;
		int num2 = 100;
		//비교연산자의 결과는 논리형이다.
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 <= num2);
		
		
		int money = 10000;
		if (money >= 15000) {//true
			System.out.println("충분해요");
			
		}
		else {//false
			System.out.println("더주세요");
			
		}
		
		
		
	}

}
