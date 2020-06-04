package 클래스;

public class 우리집_전화기있는_거실 {

	public static void main(String[] args) {

		전화기 전화기1 = new 전화기();
		전화기 전화기2 = new 전화기();
		
		전화기1.color="black";
		전화기1.size="big";
		전화기1.bell();
		전화기1.call();
		System.out.println("전화기1의 색상: "+전화기1.color+", 전화기1의 크기: "+전화기1.size);
		
		전화기2.color="red";
		전화기2.size="small";
		전화기2.bell();
		전화기2.call();
		System.out.println("전화기2의 색상: "+전화기2.color+", 전화기2의 크기: "+전화기2.size);
		
		
		
	}

}
