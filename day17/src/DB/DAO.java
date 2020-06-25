package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class DAO {//db���� Ŭ����

	public void insert(String id, String pw, String name, String tel) throws Exception {
		//�ǹ������� 1,2,3���� �������� �ϱ����� google myBatis�� ���
				
		
		//1.����̹� (Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver"); //�ٿ�ε�����
		System.out.println("1. ����̹� ���� ok...");
		
		
		//2.DB����(TableName, root, password)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);//����!
		System.out.println("2. DB���� ok...");
		
		
		//3.sql�� ����
		String sql = "insert into member values (?,?,?,?)";//���� ���� �𸣴� �ڸ��� ?�� �־��
		
		//sql������ ����ϴ� ��ü�� ������־�� �ڹٴ� �ν��Ѵ�. ps 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); //�����ϰ� index�� 1�ν����Ѵ�. ���� ?�ڸ��� ������ �Է¹��� data������ 1:1�� ��Ī�ϴ°�
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. sql��  ���� ok...");
		
		
		//4.sql�� db�� ����
		ps.executeUpdate(); //����
		System.out.println("4. sql�� ���� ok...");
		
		//db�� ���� ����
		ps.close();
		con.close();
		
	}
	
	
	
	public void delete(String id) throws Exception {
		
		
		
		//1.����̹� (Ŀ����) ����
		Class.forName("com.mysql.jdbc.Driver"); //�ٿ�ε�����
		System.out.println("1. ����̹� ���� ok...");
		
		
		//2.DB����(TableName, root, password)
		String url = "jdbc:mysql://localhost:3366/shop";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url,user,password);//����!
		System.out.println("2. DB���� ok...");
		
		
		//3.sql�� ����
		String sql = "delete from member where id = ?";//���� ���� �𸣴� �ڸ��� ?�� �־��
		
		//sql������ ����ϴ� ��ü�� ������־�� �ڹٴ� �ν��Ѵ�. ps 
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id); //�����ϰ� index�� 1�ν����Ѵ�. ���� ?�ڸ��� ������ �Է¹��� data������ 1:1�� ��Ī�ϴ°�

		System.out.println("3. sql��  ���� ok...");
		
		
		//4.sql�� db�� ����
		ps.executeUpdate(); //����
		System.out.println("4. sql�� ���� ok...");
		
		//db�� ���� ����
		ps.close();
		con.close();
		
	}

}
