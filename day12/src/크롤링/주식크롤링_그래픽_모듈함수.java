package ũ�Ѹ�;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class �ֽ�ũ�Ѹ�_�׷���_����Լ� {

	public String[] naver(String data) {

		Document doc = null;

		try {
			doc = Jsoup.connect("https://finance.naver.com/item/main.nhn?code=" + data).get();
		} catch (IOException e) {
			System.out.println("ũ�Ѹ� �ϴ� �� ���� �߻�. �����ʿ�!");
		}

		Elements list = doc.select("span.code");

		String code = list.get(0).text(); // �ڵ尡 index = 0���� ����.
		System.out.println("�ڵ�: " + code);

		Elements list3 = doc.select(".wrap_company a");

		String name = list3.get(0).text(); // ȸ����� index = 0���� ����.
		System.out.println("ȸ���: " + name);

		// ���簡 ã��
		// Elements list4 = doc.select("no_today"); //�� ���� blind��� �������� ã�Ƴ�.
		Elements list4 = doc.select("span.blind");
		// System.out.println(list4);
		String now = list4.get(12).text();
		System.out.println("���簡: " + now);

		// �� ã��
		String high = list4.get(16).text();
		System.out.println("��: " + list4.get(16).text());

		// ���� ã��
		String low = list4.get(20).text();
		System.out.println("����: " + low);

		System.out.println("----------------------------------------");

		// ���ϻ���
		// ����ó��
		try {
			FileWriter file = new FileWriter(name + ".txt");
			file.write(code + "\n");
			file.write(name + "\n");
			file.write(now + "\n");
			file.write(high + "\n");
			file.write(low + "\n");
			file.close();
		} catch (IOException e) {
			System.out.println("���� ���� �� ������ ����");
		}
		
		//������ now high low�� ���� Ÿ���̹Ƿ� �迭�� ����
		String[] values = {now, high, low};
		return values; //values�迭�� �ּҰ��� �ѱ�ž�.
		
		

	}

}
