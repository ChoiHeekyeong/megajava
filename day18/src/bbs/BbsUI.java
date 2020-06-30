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
		setTitle("게시판");
		setSize(500, 750);

		JLabel l1 = new JLabel("<나의 게시판>");
		JLabel l11 = new JLabel("    -------------    ");
		JLabel l2 = new JLabel("  게시판 i  d  ");
		JLabel l3 = new JLabel("게시판 제   목");
		JLabel l4 = new JLabel("게시판 내   용");
		JLabel l5 = new JLabel("게시판 작성자");

		Font font1 = new Font("바탕", 1, 65);
		Font font2 = new Font("바탕", 1, 30);

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

		JButton b = new JButton("게시물 작성하기");
		JButton b2 = new JButton("게시물 삭제하기");
		JButton b3 = new JButton("게시물 검색하기");
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

		// Control부분 (View에서 분리하지 못한 코드)
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1.입력한 값 가지고 오기
				String id = t1.getText();
				String title = t2.getText();
				String content = t3.getText();
				String writer = t4.getText();

				// 2.DAO에 처리하도록 전달하기
				BbsDAO dao = new BbsDAO();
				//가방을 만든 이유(set/get)
				//=>많은 양의 데이터를 가방에 넣어서 전달하려고!
				//가방 역할의 클래스를 Data Transger Object (DTO)라고 부름
				//DTO, 값만 넣었다 뺐다 한다고 해서 Value Object (VO)라고 부르기도 함
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
				// 1.입력한 값 가지고 오기
				String id = t1.getText();
;

				// 2.DAO에 처리하도록 전달하기
				BbsDAO dao = new BbsDAO();
				dao.delete(id);

			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1.입력한 값 가지고 오기
				String id = t1.getText();
;

				// 2.DAO에 처리하도록 전달하기
				BbsDAO dao = new BbsDAO();
				BbsBag bag = dao.read(id);
				//UI에 나타내기
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
