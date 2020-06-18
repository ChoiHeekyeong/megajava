package 우리회사;

public class 직원 {
	public String name = "홍길동"; //+ 같은패키지+다른패키지 접근 가능
	protected int salary=100;//# 같은패키지+다른패키지(단, 상속관계에 있을때만)에서만 접근가능
	String address = "서울"; //default 같은 패키지 내에서만 접근 가능
	private int rrn=979797; //- private:해당 클래스에서만 접근 가능
	
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
	
}
