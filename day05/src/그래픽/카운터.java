package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ī���� {
	static int count = 0;

	public static void main(String[] args) {
		
		//��ü Ʋ ��ǰ ����
		JFrame f = new JFrame();//jfr+��Ʈ��+�����̽���
		f.setSize(300, 330);
		
		FlowLayout flow = new FlowLayout();//��ġ(���� ũ�⿡ �°Բ�)
		f.setLayout(flow);
		
		
		//��ư 2�� ����
		JButton minus = new JButton("���̳ʽ�");//minus.setText("���̳ʽ�");
		JButton plus = new JButton("��  ��  ��");
		
		//�� ��ǰ ���� =>�۾������� ���.
		JLabel number = new JLabel("0");
		
		f.add(minus);
		f.add(number);
		f.add(plus);
		
		minus.setBackground(Color.orange);
		plus.setBackground(Color.yellow);
		
		
		Font font = new Font("�ü�", Font.BOLD, 100);
		Font font2 = new Font("���Ļ�浸��", Font.BOLD, 50);
		number.setFont(font);
		
		minus.setFont(font2);
		plus.setFont(font2);
		
		
		minus.addActionListener(new ActionListener() { //���� ������ ��. addActionListener()
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���̳ʽ� ��ư ����.");
				count--;
				System.out.println(count);
				number.setText(count+""); //setText() �ȿ��� ��Ʈ���� ���� �� �ִ�, count�� �����̹Ƿ� ""�� ���ؼ� ��Ʈ����ô����
			}
		});		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�÷��� ��ư ����.");
				count++;
				System.out.println(count);
				number.setText(count+""); //setText() �ȿ��� ��Ʈ���� ���� �� �ִ�, count�� �����̹Ƿ� ""�� ���ؼ� ��Ʈ����ô����
			}
		});
		
		
		
		f.setVisible(true);//�ʼ�(�������� �־���)
		
		
		
		
	}

}
