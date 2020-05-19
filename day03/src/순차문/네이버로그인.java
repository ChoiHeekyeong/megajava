package 순차문;

import javax.swing.JOptionPane;

public class 네이버로그인 {

	public static void main(String[] args) {
		String id = "root";
		String id2 = JOptionPane.showInputDialog("아이디를 입력하세요:");
		String pw = "papapa";
		String pw2 = JOptionPane.showInputDialog("비밀번호를 입력하세요:");
		
		
		
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인이 되었습니다.");
			
		} else {
			System.out.println("로그인이 되지 않았습니다.");

		}
		
		
		
		
		
		
	}

}
