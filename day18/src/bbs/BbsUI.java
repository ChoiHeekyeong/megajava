package bbs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BbsUI extends JFrame {

	public BbsUI() {
		setTitle("�Խ���");
		setSize(500, 750);

		JLabel l1 = new JLabel("<���� �Խ���>");
		JLabel l11 = new JLabel("    -------------    ");
		JLabel l2 = new JLabel("  �Խ��� i  d  ");
		JLabel l3 = new JLabel("�Խ��� ��   ��");
		JLabel l4 = new JLabel("�Խ��� ��   ��");
		JLabel l5 = new JLabel("�Խ��� �ۼ���");

		Font font1 = new Font("����", 1, 65);
		Font font2 = new Font("����", 1, 30);

		FlowLayout flow = new FlowLayout();
		setLayout(flow);

		l1.setFont(font1);
		l11.setFont(font2);
		l2.setFont(font2);
		l3.setFont(font2);
		l4.setFont(font2);
		l5.setFont(font2);

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		t1.setFont(font2);
		t2.setFont(font2);
		t3.setFont(font2);
		t4.setFont(font2);

		JButton b = new JButton("�Խù� �ۼ��ϱ�");
		JButton b2 = new JButton("�Խù� �����ϱ�");
		JButton b3 = new JButton("�Խù� �˻��ϱ�");
		b.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		add(l1);
		add(l11);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(l5);
		add(t4);
		add(b);
		add(b2);
		add(b3);

		getContentPane().setBackground(Color.yellow);
		l1.setForeground(Color.blue);
		b.setBackground(Color.pink);
		b2.setBackground(Color.gray);
		b3.setBackground(Color.blue);

		// Control�κ� (View���� �и����� ���� �ڵ�)
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1.�Է��� �� ������ ����
				String id = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();

				// 2.DAO�� ó���ϵ��� �����ϱ�
				BbsDAO dao = new BbsDAO();
				//������ ���� ����(set/get)
				//=>���� ���� �����͸� ���濡 �־ �����Ϸ���!
				//���� ������ Ŭ������ Data Transger Object (DTO)��� �θ�
				//DTO, ���� �־��� ���� �Ѵٰ� �ؼ� Value Object (VO)��� �θ��⵵ ��
				BbsBag bag = new BbsBag();
				bag.setId(id);
				bag.setTitle(title);
				bag.setContent(content);
				bag.setWriter(writer);
				
				dao.create(bag);

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1.�Է��� �� ������ ����
				String id = t1.getText();
;

				// 2.DAO�� ó���ϵ��� �����ϱ�
				BbsDAO dao = new BbsDAO();
				dao.delete(id);

			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1.�Է��� �� ������ ����
				String id = t1.getText();
;

				// 2.DAO�� ó���ϵ��� �����ϱ�
				BbsDAO dao = new BbsDAO();
				BbsBag bag = dao.read(id);
				//UI�� ��Ÿ����
				t1.setText(bag.getId());
				t2.setText(bag.getTitle());
				t3.setText(bag.getContent());
				t4.setText(bag.getWriter());
				t1.setForeground(Color.red);
				t2.setForeground(Color.red);
				t3.setForeground(Color.red);
				t4.setForeground(Color.red);
				
			}
		});

		setVisible(true);

	}
	
	
	

	public static void main(String[] args) {

		new BbsUI();

	}

}
