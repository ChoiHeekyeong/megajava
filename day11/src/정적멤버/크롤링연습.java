package �������;

import java.io.FileWriter;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ũ�Ѹ����� {

	public static void main(String[] args) throws Exception {
		//��������� ó���Ҷ�, �ܺ� �ڿ��� �����ϴ� ��� �ݵ�� ����ó���� �ؾ���.
		Document doc = Jsoup.connect("http://www.naver.com").get();
		//ü�ν� �ڵ� = .�� �� ��� �޼ҵ带 ȣ���ϴ� ��
		System.out.println(doc);
		
		//��Ÿ������(�ΰ����ε�����):	<> :�±�(tag)
		//���������� tag�� �ֿ� �������(element)
		//<span class="date">20200609</span>
		Elements list = doc.select(".current"); //current�� class�� . �� 	id�� # ��
		//select �ȿ� �Ἥ �˻��� �� �ִ� ��:: �±��̸�(�±��̸�),Ŭ�����̸�(.Ŭ�����̸�),id�̸�(#id�̸�)
		System.out.println(list.size());
		
		
		FileWriter file = new FileWriter("naver.txt");//���� ��ü ����

		
		for (Element e : list) {
			System.out.println(e.text()); //�׳� e�� ����	<strong class="current" aria-label="������">26.2��</strong> �� ����.
			file.write(e.text()+"\n");//���Ϸ� ����.
		}
		file.close();//stream
		
		
	}

}
