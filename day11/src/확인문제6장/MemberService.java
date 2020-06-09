package 확인문제6장;

public class MemberService {
	
	
	public boolean login(String id, String password) {
		if (id=="hong" && password=="12345") { //("hong".equals(id) && "12345".equals(password)) 랑 같다.
			
			return true;
			
		} else {

			return false;
		}
			
		
		
	}
	
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
