package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class W3schoolũ�Ѹ� {

	public static void main(String[] args) {
		/*
			����ó���� ���ִ� ����?
		 => �߰��� �ȵǴ� �ڵ尡 �־ �������ʰ� �ؿ� �ٺ��� ��� �̾ �����ϵ��� �ϱ�����.
		 
		 */
		
		Document doc = null;//��������, ó�� �����Ҷ� �ڵ��ʱ�ȭ�ȵ�. �����Ⱚ�� ��������! =>�������� �ʱ�ȭ����
		
		//����ó��
		try {
			doc = Jsoup.connect("https://www.w3schools.com").get();
		} catch (IOException e) {
			//e.printStackTrace(); //������ �ڼ��� �ѷ��ִ� �޼ҵ�
			System.out.println("ũ�Ѹ� �ϴ� �� ���� �߻�. �����ʿ�!");
		}
		
		//System.out.println(doc);
		
		Elements list = doc.select("h1");
		System.out.println(list.size()+"�� ����");
		
		for (Element element : list) {
			System.out.println(element);
		}
		for (Element element : list) {
			System.out.println(element.text()); // <h1></h1> �±� ���̿� �ִ� ���ڸ� ������.
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(i ==2 || i ==5) {//index =2��,5���� skip
				continue;
			}
			
			System.out.println(list.get(i).text());
		}
		
		System.out.println("----------------------------------");
		
		Elements list2 = doc.select("h3");
		System.out.println(list2.size()+"�� ����");
		
		
		for (Element element : list2) {
			System.out.println(element);
		}
		for (Element element : list2) {
			System.out.println(element.text());
		}
		
		//index 24�� �ؽ�Ʈ�� �����ϱ�.
		System.out.println("index 24 = "+ list2.get(24).text());
		
		
		
		
		
	}

}
