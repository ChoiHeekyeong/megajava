package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권_크롤링1 {

	public static void main(String[] args) {
		Document doc = null;//지역변수, 처음 선언할때 자동초기화안됨. 쓰레기값을 갖고있음! =>수동으로 초기화하자
		
		//예외처리
		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
		} catch (IOException e) {
			System.out.println("크롤링 하는 중 에러 발생. 수정필요!");
		}
		//System.out.println(doc);
		Elements list = doc.select("span.code");
		//System.out.println(list.size()); //갯수알아보기 =>1개
		String code = list.get(0).text(); //index = 0번에 있음.
		System.out.println("코드: "+code);
		
		
		////////////
		
		//Elements list2 = doc.select("a");
		//System.out.println(list2.size()); //갯수알아보기 =>1개
		//a태그만 158개임. 그래서 다른 방법을 이용. 포함관계이용
		
		
		//.wrap_company a => 한칸을 띄우면 바로 아래가 아니고 아래 중 어디인가 있으면 됨
		//.wrap_company > a => >를 쓰면 바로 아래에 있어야함.
		Elements list3 = doc.select(".wrap_company a");
		/*
		 확인하는 용도!!
		System.out.println(list3.size());
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(i + list3.get(i).text());
		}
		*/
		
		String name = list3.get(0).text();
		System.out.println("회사명: " + name);
		
		
	}

}
