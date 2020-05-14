package 연산자;

public class 논리연산자 {

	public static void main(String[] args) {
		//논리연산자는 논리적인 판단을 하려고 할 때 사용
		//조건이 2개 이상인 경우.
		//2개 중 하나만 만족해야 하는지  : and &&
		//로그인처리: and연산.
		//2개 중 하나만 만족해도 괜찮은지 : or ||
		
		//회원가입 시 지정한 것
		int id = 1111;
		int pw = 2222;
		
		//로그인 할 때 입력한 것
		int id2 = 1000;
		int pw2 = 2222;
		
		//부품(class)는 비교연산자 사용 불가!
		//string은 비교연산자(== 등)를 쓸 수 없다. string은 비교할 수 있는 연산자가 따로 있음
		//비교연산자는 기본데이터만 비교 가능.
		if ((id==id2)&&(pw==pw2)) {
			System.out.println("로그인 성공");
			
		} else {
			System.out.println("로그인 실패");

		}
		
		
		
	}

}
