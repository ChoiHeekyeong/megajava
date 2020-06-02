package 객체조립;

public class 내방 {

	public static void main(String[] args) {
		강아지 강1 = new 강아지();
		강아지 강2 = new 강아지();
		
		강1.color="황색";
		강1.name="메리";
		강1.bark();//함수 사용 //메소드를 부르다(call, 메소드 콜, 호출)
		강1.shake();
		System.out.println("이름은 "+강1.name);
		System.out.println("색깔은 "+강1.color);
		
		강2.color="검정색";
		강2.name="초코";
		강2.bark();
		강2.shake();
		System.out.println("이름은 "+강2.name);
		System.out.println("색깔은 "+강2.color);
		
		사람 사1 = new 사람();
		사1.age = 22;
		사1.name = "김지혜";
		사1.read();
		사1.seat();
		System.out.println("이름은 "+사1.name);
		System.out.println("나이는 "+사1.age);
		

	}

}
