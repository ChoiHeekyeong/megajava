package ũ�Ѹ�;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class �ֽ�ũ�Ѹ�_�׷��� {

	public static void main(String[] args) {
		JFrame f = new JFrame("���� �ֽ� ũ�Ѹ�");
		f.setSize(420,800);
		
		FlowLayout flow = new FlowLayout();
		
		JButton b1 = new JButton("��Ʈ����");
		JButton b2 = new JButton("�Ｚ����");
		JButton b3 = new JButton("�����ǰ");
		JButton b4 = new JButton("ũ�Ѹ� ����");
		
		JLabel l = new JLabel("CODE:");
		JTextField input = new JTextField(8);//8���ڸ�ŭ ������ (ũ������)
		JTextArea result = new JTextArea(5,8); //5�� 8�������� (ũ������)
		
		Font font = new Font("�ü�",1,50);
		Font font2 = new Font("�ü�",1,40);
		f.setLayout(flow);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		l.setFont(font);
		input.setFont(font);
		result.setFont(font2);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		b3.setBackground(Color.orange);
		l.setForeground(Color.red);
		input.setBackground(Color.yellow);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l);
		f.add(input);
		f.add(b4);
		f.add(result);
		
		//frame�� ���� �ٸ��ֱ����� �ʿ��Ѱ�: .getContentPane()
		f.getContentPane().setBackground(Color.pink);
		
		
		//result.setEditable(false); 
		result.setEnabled(false);//textArea�� ���ڸ� ĥ �� ���� �ϴ� ���
		
		
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //�������� textarea�� �ִ� ������ �� ������
				String data = "068270";
				�ֽ�ũ�Ѹ�_�׷���_����Լ� ���̹� = new �ֽ�ũ�Ѹ�_�׷���_����Լ�();
				String[] values = ���̹�.naver(data); //naver�Լ����� ������ ���� ����.
				result.append("���簡: "+ values[0]+"\n");
				result.append("��: "+ values[1]+"\n");
				result.append("����: "+ values[2]+"\n");
				//append�� ��� ����� ����. setText�� �����. append�� ���� �� �ؿ� �� ����.
				
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //�������� textarea�� �ִ� ������ �� ������
				String data = "005930";
				�ֽ�ũ�Ѹ�_�׷���_����Լ� ���̹� = new �ֽ�ũ�Ѹ�_�׷���_����Լ�();
				String[] values = ���̹�.naver(data); //naver�Լ����� ������ ���� ����.
				result.append("���簡: "+ values[0]+"\n");
				result.append("��: "+ values[1]+"\n");
				result.append("����: "+ values[2]+"\n");
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //�������� textarea�� �ִ� ������ �� ������
				String data = "004310";
				�ֽ�ũ�Ѹ�_�׷���_����Լ� ���̹� = new �ֽ�ũ�Ѹ�_�׷���_����Լ�();
				String[] values = ���̹�.naver(data); //naver�Լ����� ������ ���� ����.
				result.append("���簡: "+ values[0]+"\n");
				result.append("��: "+ values[1]+"\n");
				result.append("����: "+ values[2]+"\n");
			}
		});
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(""); //�������� textarea�� �ִ� ������ �� ������
				String data = input.getText(); //�ؽ�Ʈ�ʵ忡�� ���� ���� ������.
				�ֽ�ũ�Ѹ�_�׷���_����Լ� ���̹� = new �ֽ�ũ�Ѹ�_�׷���_����Լ�();
				String[] values = ���̹�.naver(data); //naver�Լ����� ������ ���� ����.
				result.append("���簡: "+ values[0]+"\n");
				result.append("��: "+ values[1]+"\n");
				result.append("����: "+ values[2]+"\n");
			}
		});
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
		
		
	}

}
