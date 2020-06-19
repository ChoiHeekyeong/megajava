package 상속생성자_문제;

public class 마우스 {
	String color;
	String company;
	int price;
	
	
	
	
	public 마우스(String color, String company, int price) {
		super();
		this.color = color;
		this.company = company;
		this.price = price;
	}




	@Override
	public String toString() {
		return "마우스 [color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	

}
