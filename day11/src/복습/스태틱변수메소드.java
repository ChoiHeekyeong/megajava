package 복습;

import javax.swing.JOptionPane;

public class 스태틱변수메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String age = JOptionPane.showInputDialog("나이를 입력");
		int age2 = Integer.parseInt(age);
		System.out.println("내년 나이는 "+(age2+1));
		
	}

}
