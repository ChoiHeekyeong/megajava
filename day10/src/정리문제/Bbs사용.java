package 정리문제;

public class Bbs사용 {

	public static void main(String[] args) {
		System.out.println("게시판");
		System.out.println("--------------");
		
		System.out.println("no     title     content     writer");
		
		Bbs g1 = new Bbs(1,"java","fun java", "park");
		Bbs g2 = new Bbs(2,"jsp","fun jsp", "hong");
		Bbs g3 = new Bbs(3,"spring","fun spring", "kim");
		
		
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		
		
		
	}

}
