package �׷���;



import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ��ù������ {

	public static void main(String[] args) {
		//â ū�� �ѹ� �������.
	
		JFrame f = new JFrame(); //jfr
		f.setSize(500, 500);//������ ���������ϱ�
		
		//��ư ���� â���� �־��.
		JButton b = new JButton();//��ư ����
		b.setText("���� ������");
		b.setBackground(Color.yellow);//��ư ����
		b.setForeground(Color.blue);//���� ����
		
		f.add(b);//frame�� ��ư �ֱ�.

		
		
		
		JButton b2 = new JButton();
		b2.setText("���� ������");
		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);
		f.add(b2);
		
		FlowLayout flow = new FlowLayout();//��ư�ΰ��� ������ �� �� �ְ�����
		f.setLayout(flow);
		
		
		
		f.setVisible(true);//�̰� ������ â�� �����ص� �Ⱥ���. //�������� ��� ���̰� �ϸ鼭 ���ִ� �� //��� �Ʒ��� �־����.
		
		
		
		
		
		
		
	}

}
