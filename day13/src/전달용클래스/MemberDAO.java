package ���޿�Ŭ����;

//Data Access Object (dbó�� Ŭ����)
public class MemberDAO {
	
	//db�� �ִ� ó���� ����
	public void insert(MemberDTO bag) {
		//db�����ؼ�
		System.out.println("db�� ����");
		
		
		System.out.println("����� id: "+ bag.getId());
		System.out.println("����� pw: "+ bag.getPw());
		System.out.println("����� name: "+ bag.getName());
		System.out.println("����� tel: "+ bag.getTel());
		
		
		//db�� ����
		System.out.println("db�� ����");
	}
	

}
