package 생성자;

public class 은행에가자 {

	public static void main(String[] args) {
		//생성자 오버로딩
		//입력값이 없는 생성자는 기본생성자.=>파라미터 있는 생성자가 하나도 없으면 이 기본생성자가 자동생성됨!
		//파라미터가 있는 생성자가 있는 경우엔 파라미터 있는 생성자로 객체를 생성할것이라고 내부적으로 판단. => 기본생성자는 만들어지지 않는다.
		계좌 account0 = new 계좌();
		account0.이름="홍길식";
		account0.종류="연금";
		account0.money=30000;
		
		
		
		계좌 account1 = new 계좌("홍길동","적금",10000);
		계좌 account2 = new 계좌("홍길순","예금");
		account2.money = 20000; //나중에 넣어줄 수 있음
		
		
		
	}

}
