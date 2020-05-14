package 데이터;

public class 기본데이터2 {
	public static void main(String[] args) {
	
		int age = 100;
		double height = 185.2;
		boolean food = true; //false
		char gender = '여';//char쓸땐 ''을 사용. 그리고 한글자만!
		
		String name = "희경"; //여러글자. ""사용. //String은 기본데이터는 아니지만 기본 데이터처럼 쓸 수 있는 부품이다.
		//원래 모든 부품은 String name =  new String("희경"); 처럼 써야한다.
		
		//char : 문자. String:문자열. 
		
		System.out.println("내 이름은 " + name);
		System.out.println("나이는 "+age+"세");
		System.out.println("키는 "+height+"cm");
		System.out.println("밥은 먹었는지 여부 "+food);
		System.out.println("성별은 "+ gender);
		//한줄 복사 단축키: 컨트롤+알트+화살표아래
		//한줄 이동 단축키: 알트+화살표 위 또는 아래
		
		
		
		
	
	}
}
