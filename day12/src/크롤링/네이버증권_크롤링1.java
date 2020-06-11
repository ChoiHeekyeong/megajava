package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����_ũ�Ѹ�1 {

	public static void main(String[] args) {
		Document doc = null;//��������, ó�� �����Ҷ� �ڵ��ʱ�ȭ�ȵ�. �����Ⱚ�� ��������! =>�������� �ʱ�ȭ����
		
		//����ó��
		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=068270").get();
		} catch (IOException e) {
			System.out.println("ũ�Ѹ� �ϴ� �� ���� �߻�. �����ʿ�!");
		}
		//System.out.println(doc);
		Elements list = doc.select("span.code");
		//System.out.println(list.size()); //�����˾ƺ��� =>1��
		String code = list.get(0).text(); //index = 0���� ����.
		System.out.println("�ڵ�: "+code);
		
		
		////////////
		
		//Elements list2 = doc.select("a");
		//System.out.println(list2.size()); //�����˾ƺ��� =>1��
		//a�±׸� 158����. �׷��� �ٸ� ����� �̿�. ���԰����̿�
		
		
		//.wrap_company a => ��ĭ�� ���� �ٷ� �Ʒ��� �ƴϰ� �Ʒ� �� ����ΰ� ������ ��
		//.wrap_company > a => >�� ���� �ٷ� �Ʒ��� �־����.
		Elements list3 = doc.select(".wrap_company a");
		/*
		 Ȯ���ϴ� �뵵!!
		System.out.println(list3.size());
		for (int i = 0; i < list3.size(); i++) {
			System.out.println(i + list3.get(i).text());
		}
		*/
		
		String name = list3.get(0).text();
		System.out.println("ȸ���: " + name);
		
		
	}

}
