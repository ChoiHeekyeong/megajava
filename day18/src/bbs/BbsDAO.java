package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {

	public void create(BbsBag bag) {

		System.out.println("게시물 DB에 저장처리 됨");

		// DB처리(1~4단계)
		try {
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이브 설정 성공...");

			// 2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";// 자바와 디비를 연결하는 url. 이건 정해져있으므로 생각 안나면 포털에 가서 검색하면 됨 3366은
															// port번호, shop은 연결할 데이터베이스 이름
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공...");

			// 3. SQL문 작성
			String sql = "insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); // 이 객체가 있어야 전달 가능
			// 위의 ?에 값 넣어주기
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());

			System.out.println("3. SQL 작성 ok...");

			// 4. SQL문 DB로 전달
			ps.executeUpdate(); // 전달하는 메소드
			System.out.println("4. SQL 전달 성공...");

		} catch (Exception e) {

		}

	}

	public BbsBag read(String id) {

		System.out.println("게시물 DB에 읽기처리 됨");

		// 검색 결과의 항목은 4개일 것이다.
		// 3,spring,fun,spring,song 이런식으로...4개
		// DB를 읽은 다음에 UI로 다시 넘겨야한다. => 여러 data값들을 DTO로 묶어서 보낸다.

		// DB처리(1~4단계)
		BbsBag bag = null; //우선 초기주소를 null로 해둔다.. 값이 없을때를 대비하여.
		try {
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이브 설정 성공...");

			// 2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";// 자바와 디비를 연결하는 url. 이건 정해져있으므로 생각 안나면 포털에 가서 검색하면 됨 3366은
															// port번호, shop은 연결할 데이터베이스 이름
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공...");

			// 3. SQL문 작성
			String sql = "select * from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // 이 객체가 있어야 전달 가능
			// 위의 ?에 값 넣어주기
			ps.setString(1, id);

			System.out.println("3. SQL 작성 ok...");

			// 4. SQL문 DB로 전달 후 검색결과를 갖고오기
			ResultSet rs = ps.executeQuery(); // Update만 메소드가 이거로 다르다~~~~~~~~~~~~~~~~~~~
			System.out.println("4. SQL 전달 성공...");
			
			//id값이 있는지 없는지  조건체크
			if (rs.next()) {//있으면 true
				bag = new BbsBag();
				String id2 = rs.getString(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				bag.setId(id2);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
			}
		} catch (Exception e) {

		}
		return bag;

	}

	public void update() {

		System.out.println("게시물 DB에 수정처리 됨");
	}

	public void delete(String id) {

		System.out.println("게시물 DB에 삭제처리 됨");

		// DB처리(1~4단계)
		try {
			// 1. 드라이버 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이브 설정 성공...");

			// 2. DB연결
			String url = "jdbc:mysql://localhost:3366/shop";// 자바와 디비를 연결하는 url. 이건 정해져있으므로 생각 안나면 포털에 가서 검색하면 됨 3366은
															// port번호, shop은 연결할 데이터베이스 이름
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공...");

			// 3. SQL문 작성
			String sql = "delete from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // 이 객체가 있어야 전달 가능
			// 위의 ?에 값 넣어주기
			ps.setString(1, id);

			System.out.println("3. SQL 작성 ok...");

			// 4. SQL문 DB로 전달
			ps.executeUpdate(); // 전달하는 메소드
			System.out.println("4. SQL 전달 성공...");

		} catch (Exception e) {

		}

	}

}
