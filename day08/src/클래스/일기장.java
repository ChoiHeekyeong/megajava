package 클래스;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class 일기장 {

	public static void main(String[] args) throws Exception {
		//입력받기
		String day = JOptionPane.showInputDialog("날짜입력");
		String title = JOptionPane.showInputDialog("제목입력");
		String content = JOptionPane.showInputDialog("내용입력");
		
		//위치 지정해서 저장.
		
//		File file = new File("c:/imsi"); //()안에 위치.
//		System.out.println("파일이 있을까? "+ file.exists()); //파일이 존재하는지 확인.
		
		FileWriter file = new FileWriter("c:/imsi/"+day+".txt"); //해당위치에 해당 파일 생성하는 부품 
		file.write("day: " + day + "\n");
		file.write("title: " + title + "\n");
		file.write("content: "+ content + "\n");
		file.close();//이걸 써야지 파일내용입력이 끝났다는 걸 컴퓨터가 알아차림.. 안쓰면 내용이 입력이안됨
		
		
		
		
		
	}

}
