package 응용문제;

public interface DAOInterface {
	public void create(String id, String pw);
	public void read(String id);
	public void update(String id, String pw);
	public void delete(String id);


}
