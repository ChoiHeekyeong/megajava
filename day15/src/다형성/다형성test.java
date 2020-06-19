package 다형성;

import 상속생성자.문의게시판;
import 상속생성자.일반게시판;

public class 다형성test {

	public static void main(String[] args) {
		//부모에 자식이름으로 된 객체를 넣어줌 (다형성)
		일반게시판 re = new 문의게시판(1,"자바","자바잼써","홍길동","꺅");
		
		
	}

}
