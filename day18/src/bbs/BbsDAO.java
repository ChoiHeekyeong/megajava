package bbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BbsDAO {

	public void create(BbsBag bag) {

		System.out.println("�Խù� DB�� ����ó�� ��");

		// DBó��(1~4�ܰ�)
		try {
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̺� ���� ����...");

			// 2. DB����
			String url = "jdbc:mysql://localhost:3366/shop";// �ڹٿ� ��� �����ϴ� url. �̰� �����������Ƿ� ���� �ȳ��� ���п� ���� �˻��ϸ� �� 3366��
															// port��ȣ, shop�� ������ �����ͺ��̽� �̸�
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����...");

			// 3. SQL�� �ۼ�
			String sql = "insert into bbs values (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); // �� ��ü�� �־�� ���� ����
			// ���� ?�� �� �־��ֱ�
			ps.setString(1, bag.getId());
			ps.setString(2, bag.getTitle());
			ps.setString(3, bag.getContent());
			ps.setString(4, bag.getWriter());

			System.out.println("3. SQL �ۼ� ok...");

			// 4. SQL�� DB�� ����
			ps.executeUpdate(); // �����ϴ� �޼ҵ�
			System.out.println("4. SQL ���� ����...");

		} catch (Exception e) {

		}

	}

	public BbsBag read(String id) {

		System.out.println("�Խù� DB�� �б�ó�� ��");

		// �˻� ����� �׸��� 4���� ���̴�.
		// 3,spring,fun,spring,song �̷�������...4��
		// DB�� ���� ������ UI�� �ٽ� �Ѱܾ��Ѵ�. => ���� data������ DTO�� ��� ������.

		// DBó��(1~4�ܰ�)
		BbsBag bag = null; //�켱 �ʱ��ּҸ� null�� �صд�.. ���� �������� ����Ͽ�.
		try {
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̺� ���� ����...");

			// 2. DB����
			String url = "jdbc:mysql://localhost:3366/shop";// �ڹٿ� ��� �����ϴ� url. �̰� �����������Ƿ� ���� �ȳ��� ���п� ���� �˻��ϸ� �� 3366��
															// port��ȣ, shop�� ������ �����ͺ��̽� �̸�
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����...");

			// 3. SQL�� �ۼ�
			String sql = "select * from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // �� ��ü�� �־�� ���� ����
			// ���� ?�� �� �־��ֱ�
			ps.setString(1, id);

			System.out.println("3. SQL �ۼ� ok...");

			// 4. SQL�� DB�� ���� �� �˻������ �������
			ResultSet rs = ps.executeQuery(); // Update�� �޼ҵ尡 �̰ŷ� �ٸ���~~~~~~~~~~~~~~~~~~~
			System.out.println("4. SQL ���� ����...");
			
			//id���� �ִ��� ������  ����üũ
			if (rs.next()) {//������ true
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

		System.out.println("�Խù� DB�� ����ó�� ��");
	}

	public void delete(String id) {

		System.out.println("�Խù� DB�� ����ó�� ��");

		// DBó��(1~4�ܰ�)
		try {
			// 1. ����̹� ����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. ����̺� ���� ����...");

			// 2. DB����
			String url = "jdbc:mysql://localhost:3366/shop";// �ڹٿ� ��� �����ϴ� url. �̰� �����������Ƿ� ���� �ȳ��� ���п� ���� �˻��ϸ� �� 3366��
															// port��ȣ, shop�� ������ �����ͺ��̽� �̸�
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB���� ����...");

			// 3. SQL�� �ۼ�
			String sql = "delete from bbs where id = ?";
			PreparedStatement ps = con.prepareStatement(sql); // �� ��ü�� �־�� ���� ����
			// ���� ?�� �� �־��ֱ�
			ps.setString(1, id);

			System.out.println("3. SQL �ۼ� ok...");

			// 4. SQL�� DB�� ����
			ps.executeUpdate(); // �����ϴ� �޼ҵ�
			System.out.println("4. SQL ���� ����...");

		} catch (Exception e) {

		}

	}

}
