package 생성자;

public class 계좌 {
	//필수
	String 이름;
	String 종류;
	int money;
	
	//기본생성자, 명시적으로 생성해야함!!
	//파라미터가 있는 생성자가 하나도 없는 경우는 묵시적으로 자동생성됨.
	public 계좌() {
		
	}


	public 계좌(String 이름, String 종류) {
		super();
		this.이름 = 이름;
		this.종류 = 종류;
	}


	public 계좌(String 이름, String 종류, int money) {
		super();
		this.이름 = 이름;
		this.종류 = 종류;
		this.money = money;
	}
	
	
	
	
	
}
