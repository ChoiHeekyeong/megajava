package 크롤링;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 주식크롤링_그래픽_모듈함수 {

	public String[] naver(String data) {

		Document doc = null;

		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + data).get();
		} catch (IOException e) {
			System.out.println("크롤링 하는 중 에러 발생. 수정필요!");
		}

		Elements list = doc.select("span.code");

		String code = list.get(0).text(); // 코드가 index = 0번에 있음.
		System.out.println("코드: " + code);

		Elements list3 = doc.select(".wrap_company a");

		String name = list3.get(0).text(); // 회사명이 index = 0번에 있음.
		System.out.println("회사명: " + name);

		// 현재가 찾기
		// Elements list4 = doc.select("no_today"); //를 통해 blind라는 숨겨진걸 찾아냄.
		Elements list4 = doc.select("span.blind");
		// System.out.println(list4);
		String now = list4.get(12).text();
		System.out.println("현재가: " + now);

		// 고가 찾기
		String high = list4.get(16).text();
		System.out.println("고가: " + list4.get(16).text());

		// 저가 찾기
		String low = list4.get(20).text();
		System.out.println("저가: " + low);

		System.out.println("----------------------------------------");

		// 파일생성
		// 예외처리
		try {
			FileWriter file = new FileWriter(name + ".txt");
			file.write(code + "\n");
			file.write(name + "\n");
			file.write(now + "\n");
			file.write(high + "\n");
			file.write(low + "\n");
			file.close();
		} catch (IOException e) {
			System.out.println("파일 생성 중 문제가 생김");
		}
		
		//리턴할 now high low는 같은 타입이므로 배열로 묶자
		String[] values = {now, high, low};
		return values; //values배열의 주소값을 넘길거야.
		
		

	}

}
