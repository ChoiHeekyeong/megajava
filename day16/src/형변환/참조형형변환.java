package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class 참조형형변환 {

	public static void main(String[] args) {

		// 배열의 형변환은 없다.
		// 클래스간, 클래스와 인터페이스간 가능
		// 상속,구현관계에서만 가능
		//자동차타이어<-한국타이어,금호타이어	(상속관계)
		//자동차타이어(큰)<-한국타이어(작), 자동형변환
		//한국타이어(작)<-자동차타이어(큰) , 강제형변환
		//자동차타이어가 더 큰 개념
		
		//자동형변환 = 업캐스팅
		//강제형변환 = 다운캐스팅
		
		ArrayList list = new ArrayList();
		//아무거나 다 들어가고 크기도 조절가능
		//업캐스팅되어 들어감:: 부모자리로 맞춰놓으면 그 아래에 있는 자식이나 후손이 부모자리에 다 들어갈 수 있다.
		list.add("고구마");//object는 모든 클래스의 최상위 부모
		
		list.add(100);//Integer (포장클래스)
		//기본형 --(포장, boxing)-->포장클래스
		//기본형 <--(포장풀기,unboxing)--포장클래스
		//자동 박싱, 언박싱이 된다. (auto boxing, auto unboxing)
		list.add(11.22);
		list.add(new JButton());
		list.add(new JLabel());
		
		
		Object food1 = list.get(0);//상위클래스인 object로 꺼내면 String 기능을 쓸 수 없음
		String food2 = (String) list.get(0);//꺼낼땐 다운캐스팅.
		
		
		
		
		
	}

}
