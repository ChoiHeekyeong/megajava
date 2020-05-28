package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
//		int x = 100;
//		int y = x;//기본형의 복사
//		
//		System.out.println("x = " +x);
//		System.out.println("y = " +y);
//		
//		x=200;
//		System.out.println("x = " +x);
//		System.out.println("y = " +y);
//		

		int[] x = { 100, 200, 300 };
		int[] y = x; // 참조형의 복사

		for (int i = 0; i < y.length; i++) {

			System.out.println("x: " + x[i] + ", " + "y: " + y[i]);
		}
		System.out.println("얕은 복사 x의 주소: " + x);
		System.out.println("얕은 복사 y의 주소: " + y);

		System.out.println();
		x[0] = 999;

		for (int i = 0; i < y.length; i++) {

			System.out.println("x: " + x[i] + ", " + "y: " + y[i]);
		}

		System.out.println("---------------------");
		// 깊은 복사 ::명령어를 통해서 해야한다.

		int[] a = { 100, 200, 300 };
		int[] b = a.clone();
		System.out.println("깊은 복사 a의 주소: " + a);
		System.out.println("깊은 복사 b의 주소: " + b);

		a[0] = 999;
		for (int i = 0; i < a.length; i++) {

			System.out.println("a: " + a[i] + ", " + "b: " + b[i]);
		}

	}

}
