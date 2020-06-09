package 정적멤버;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습 {

	public static void main(String[] args) throws Exception {
		//파일입출력 처리할때, 외부 자원과 연결하는 경우 반드시 예외처리를 해야함.
		Document doc = Jsoup.connect("http://www.naver.com").get();
		//체인식 코딩 = .을 찍어서 계속 메소드를 호출하는 것
		System.out.println(doc);
		
		//메타데이터(부가적인데이터):	<> :태그(tag)
		//웹페이지는 tag가 주요 구성요소(element)
		//<span class="date">20200609</span>
		Elements list = doc.select(".current"); //current가 class라 . 씀 	id는 # 씀
		//select 안에 써서 검색할 수 있는 것:: 태그이름(태그이름),클래스이름(.클래스이름),id이름(#id이름)
		System.out.println(list.size());
		
		
		FileWriter file = new FileWriter("naver.txt");//파일 객체 생성

		
		for (Element e : list) {
			System.out.println(e.text()); //그냥 e만 쓰면	<strong class="current" aria-label="현재기온">26.2°</strong> 가 나옴.
			file.write(e.text()+"\n");//파일로 저장.
		}
		file.close();//stream
		
		
	}

}
