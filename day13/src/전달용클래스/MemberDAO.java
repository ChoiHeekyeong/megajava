package 전달용클래스;

//Data Access Object (db처리 클래스)
public class MemberDAO {
	
	//db에 넣는 처리를 구현
	public void insert(MemberDTO bag) {
		//db접속해서
		System.out.println("db에 접속");
		
		
		System.out.println("저장된 id: "+ bag.getId());
		System.out.println("저장된 pw: "+ bag.getPw());
		System.out.println("저장된 name: "+ bag.getName());
		System.out.println("저장된 tel: "+ bag.getTel());
		
		
		//db에 저장
		System.out.println("db에 저장");
	}
	

}
