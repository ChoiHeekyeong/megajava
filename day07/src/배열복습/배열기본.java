package 배열복습;

public class 배열기본 {

	public static void main(String[] args) {
		//1. 배열을 만드는 순간 많은 양의 데이터를 이미 데이터를 알고있는 경우
		String[] food = {"마라탕","마카롱","곱창"};
		
		//배열은 같은 타입만 묶을 수 있다.
		//Object[] p = {"d",1}; //데이터들의 타입이 달라도 쓸 수 있는 배열이지만 비추천..
		
		food[0]="치즈케이크";
		
		//for
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		//for-each
		for (String x : food) {
			System.out.println(x);
		}
		
		
		
		//2. 배열을 만드는 순간 많은 양의 데이터를 데이터를 모르고 있는 경우
		String[] doing = new String[3];
		doing[0]="회사인";
		doing[1]="개발자";
		doing[2]="여행가";
		
		for (String x : doing) {
			System.out.println(x);
			
		}
		
		
		
		for (int i = 0; i < doing.length; i++) {
			if(doing[i]=="개발자") {
				System.out.println(i);
			}
		}
		
		

	}

}
