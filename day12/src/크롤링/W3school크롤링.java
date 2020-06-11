package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3school크롤링 {

	public static void main(String[] args) {
		/*
			예외처리를 해주는 이유?
		 => 중간에 안되는 코드가 있어도 멈추지않고 밑에 줄부터 계속 이어서 실행하도록 하기위해.
		 
		 */
		
		Document doc = null;//지역변수, 처음 선언할때 자동초기화안됨. 쓰레기값을 갖고있음! =>수동으로 초기화하자
		
		//예외처리
		try {
			doc = Jsoup.connect("https://www.w3schools.com").get();
		} catch (IOException e) {
			//e.printStackTrace(); //에러를 자세히 뿌려주는 메소드
			System.out.println("크롤링 하는 중 에러 발생. 수정필요!");
		}
		
		//System.out.println(doc);
		
		Elements list = doc.select("h1");
		System.out.println(list.size()+"개 있음");
		
		for (Element element : list) {
			System.out.println(element);
		}
		for (Element element : list) {
			System.out.println(element.text()); // <h1></h1> 태그 사이에 있는 글자만 빼오기.
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(i ==2 || i ==5) {//index =2번,5번은 skip
				continue;
			}
			
			System.out.println(list.get(i).text());
		}
		
		System.out.println("----------------------------------");
		
		Elements list2 = doc.select("h3");
		System.out.println(list2.size()+"개 있음");
		
		
		for (Element element : list2) {
			System.out.println(element);
		}
		for (Element element : list2) {
			System.out.println(element.text());
		}
		
		//index 24의 텍스트만 추출하기.
		System.out.println("index 24 = "+ list2.get(24).text());
		
		
		
		
		
	}

}
