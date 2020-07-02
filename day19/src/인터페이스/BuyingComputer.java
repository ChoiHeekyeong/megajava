package 인터페이스;

public class BuyingComputer {

	public static void main(String[] args) {

		AppleCom com1 = new AppleCom();
		BananaCom com2 = new BananaCom();
		
		
		com1.cal();
		com1.internet();
		com2.cal();
		com2.internet();
	}

}
