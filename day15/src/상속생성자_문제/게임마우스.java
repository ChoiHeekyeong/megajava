package 상속생성자_문제;

public class 게임마우스 extends 마우스{

	int vec;

	
	
	
	
	public 게임마우스(String color, String company, int price, int vec) {
		super(color, company, price);
		this.vec = vec;
	}



	@Override
	public String toString() {
		return "게임마우스 [vec=" + vec + ", color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	
	
}
