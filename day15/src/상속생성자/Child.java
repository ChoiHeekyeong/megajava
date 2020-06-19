package 상속생성자;

public final class Child extends Parent{

	@Override
	void tv() {
//		super.tv();
		System.out.println("무한도전을 보다");
	}
	
	void together() {
		tv();//나는 티비를보다
		super.tv();//부모님이 티비를 보신다
		
	}
	

	
}
