package 순차문;

import javax.swing.JOptionPane;

public class 성인판별 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		String age = JOptionPane.showInputDialog("나이를 입력하세요"); //변수 타입이 int일 수 없다.항상 String. //팝업창에 입력하면 정수와 문자열을 구분 할 수 없기때문.
		int age2 = Integer.parseInt(age); //스트링을 인트로 바꿈.
		

		/*
		 JOptionPane.showMessageDialog(null, "당신의 이름은 "+name);//null자리가 부모자리. (부모: 어디위에 창이 뜰건지)
		 */
		
		if(age2>=18) {
			JOptionPane.showMessageDialog(null, name+"님은 성인입니다.");
		}
		else {
			JOptionPane.showMessageDialog(null, name+"님은 성인이 아닙니다.");
		}
		
		
	}

}
