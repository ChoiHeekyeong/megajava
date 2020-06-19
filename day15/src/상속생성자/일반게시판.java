package 상속생성자;

public class 일반게시판 { //extends Object

	int no;
	String title;
	String content;
	String writer;
	
	
	public 일반게시판() {
	}
	
	
	public 일반게시판(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}





	@Override
	public String toString() {
		return "일반게시판 [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
	
}
