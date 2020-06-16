package 전달용클래스;

import java.util.Scanner;

public class 회원가입 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 id: ");
		String id = sc.next();
		System.out.println("회원 pw: ");
		String pw = sc.next();
		System.out.println("회원 name: ");
		String name = sc.next();
		System.out.println("회원 tel: ");
		String tel = sc.next();
		
		//입력한 데이터들을 DB저장용 클래스로 넘김
		
		MemberDAO dao = new MemberDAO();
		
		MemberDTO bag = new MemberDTO(); //가방생성
		//가방에 데이터 넣어줌
		bag.setId(id);
		bag.setPw(pw);
		bag.setName(name);
		bag.setTel(tel);
		
		
		//가방을 db처리 클래스로 보냄
		dao.insert(bag);
	}

}
