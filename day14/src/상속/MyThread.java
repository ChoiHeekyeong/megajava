package 상속;

public class MyThread {

	public static void main(String[] args) {
		Star star = new Star();
		Diamond diamond = new Diamond();
		
//		이렇게하면 호출한 순서대로 별부터 나옴. 동시에 실행하라고 cpu에 알려주는 방법이 아니란 소리.
//		star.run();
//		diamond.run();
		
		//동시에 처리하라고 알려주는 메소드는 start
		star.start();
		diamond.start();
		
		
	}

}
