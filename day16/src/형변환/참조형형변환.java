package ����ȯ;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ����������ȯ {

	public static void main(String[] args) {

		// �迭�� ����ȯ�� ����.
		// Ŭ������, Ŭ������ �������̽��� ����
		// ���,�������迡���� ����
		//�ڵ���Ÿ�̾�<-�ѱ�Ÿ�̾�,��ȣŸ�̾�	(��Ӱ���)
		//�ڵ���Ÿ�̾�(ū)<-�ѱ�Ÿ�̾�(��), �ڵ�����ȯ
		//�ѱ�Ÿ�̾�(��)<-�ڵ���Ÿ�̾�(ū) , ��������ȯ
		//�ڵ���Ÿ�̾ �� ū ����
		
		//�ڵ�����ȯ = ��ĳ����
		//��������ȯ = �ٿ�ĳ����
		
		ArrayList list = new ArrayList();
		//�ƹ��ų� �� ���� ũ�⵵ ��������
		//��ĳ���õǾ� ��:: �θ��ڸ��� ��������� �� �Ʒ��� �ִ� �ڽ��̳� �ļ��� �θ��ڸ��� �� �� �� �ִ�.
		list.add("����");//object�� ��� Ŭ������ �ֻ��� �θ�
		
		list.add(100);//Integer (����Ŭ����)
		//�⺻�� --(����, boxing)-->����Ŭ����
		//�⺻�� <--(����Ǯ��,unboxing)--����Ŭ����
		//�ڵ� �ڽ�, ��ڽ��� �ȴ�. (auto boxing, auto unboxing)
		list.add(11.22);
		list.add(new JButton());
		list.add(new JLabel());
		
		
		Object food1 = list.get(0);//����Ŭ������ object�� ������ String ����� �� �� ����
		String food2 = (String) list.get(0);//������ �ٿ�ĳ����.
		
		
		
		
		
	}

}
