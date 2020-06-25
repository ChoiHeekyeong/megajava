package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DAO {//db전담 클래스

	public void insert(String id, String pw, String name, String tel) throws Exception {
		//실무에서는 1,2,3번을 묶은것을 하기위해 google myBatis을 사용
				
		
		//1.드라이버 (커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver"); //다운로드폴더
		System.out.println("1. 드라이버 설정 ok...");
		
		
		//2.DB연결(TableName, root, password)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);//연결!
		System.out.println("2. DB연결 ok...");
		
		
		//3.sql문 생성
		String sql = "insert into member values (?,?,?,?)";//뭐가 들어갈지 모르는 자리에 ?을 넣어둠
		
		//sql문장을 담당하는 객체로 만들어주어야 자바는 인식한다. ps 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); //유일하게 index가 1로시작한다. 위에 ?자리와 위에서 입력받은 data값들을 1:1로 매칭하는것
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql문  생성 ok...");
		
		
		//4.sql문 db로 전송
		ps.executeUpdate(); //전송
		System.out.println("4. sql문 전송 ok...");
		
		//db와 연결 끊기
		ps.close();
		con.close();
		
	}
	
	
	
	public void delete(String id) throws Exception {
		
		
		
		//1.드라이버 (커넥터) 설정
		Class.forName("com.mysql.jdbc.Driver"); //다운로드폴더
		System.out.println("1. 드라이버 설정 ok...");
		
		
		//2.DB연결(TableName, root, password)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);//연결!
		System.out.println("2. DB연결 ok...");
		
		
		//3.sql문 생성
		String sql = "delete from member where id = ?";//뭐가 들어갈지 모르는 자리에 ?을 넣어둠
		
		//sql문장을 담당하는 객체로 만들어주어야 자바는 인식한다. ps 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); //유일하게 index가 1로시작한다. 위에 ?자리와 위에서 입력받은 data값들을 1:1로 매칭하는것

		System.out.println("3. sql문  생성 ok...");
		
		
		//4.sql문 db로 전송
		ps.executeUpdate(); //전송
		System.out.println("4. sql문 전송 ok...");
		
		//db와 연결 끊기
		ps.close();
		con.close();
		
	}

}
