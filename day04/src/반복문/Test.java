package 반복문;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		//두 수를 입력 받아서 누가 더 큰가?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n1의 값을 입력하세요: ");
		int n1 = sc.nextInt();
		System.out.print("n2의 값을 입력하세요: ");
		int n2 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("n1값이 더 큽니다");
		}
		else if(n1<n2) {
			
			System.out.println("n2값이 더 큽니다");
		}
		else {
			System.out.println("두 값이 같습니다");
		}
		
		
		//당신이 좋아하는 과목은?
		System.out.println("당신이 좋아하는 과목은?");
		String data = sc.next(); //한단어만 가져옴. 공백을 인식해버림. 한 줄을 다 갖고오고싶으면 nextLine()을 사용한다. 이건 공백으로 구분 x
		
		switch (data) {
		case "자바":
			System.out.println("JSP로 점프!");
			break;
		case "파이썬":
			System.out.println("장고로 점프!");
			break;
		default:
			System.out.println("무조건 열심히!!");
			break;
		}
		
		
		
		
		
	}
	
	
	
	
	
	

}
