package 확인문제;

public class Account {

	String no;
	String name;
	int money;
	
	//객체 생성시 자동 호출되는 메소드: 생성자 메소드
	//메소드의 입력값에 따라 메소드가 호출된다.
	//파라메터가 있는 생성자를 만들어놓으면 객체생성시 반드시 필요한 값들을 지정할 수 있다.
	public Account(String no, String name, int money) {
		this.no = no;
		this.name = name;
		this.money = money;
	}

	//멤버변수에 값을 넣을 때는 생성자를 사용!
	//멤버 변수의 값을 출력할 때는 toString을 사용!
	
	
	
	@Override
	public String toString() {
		return "Account [계좌번호=" + no + ", 계좌주=" + name + ", 초기값=" + money + "]";
	}
	
	
	
	
	
	

}
