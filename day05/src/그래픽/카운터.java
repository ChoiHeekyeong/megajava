package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운터 {
	static int count = 0;

	public static void main(String[] args) {
		
		//전체 틀 부품 복사
		JFrame f = new JFrame();//jfr+컨트롤+스페이스바
		f.setSize(300, 330);
		
		FlowLayout flow = new FlowLayout();//배치(글자 크기에 맞게끔)
		f.setLayout(flow);
		
		
		//버튼 2개 복사
		JButton minus = new JButton("마이너스");//minus.setText("마이너스");
		JButton plus = new JButton("플  러  스");
		
		//라벨 부품 복사 =>글씨넣을때 사용.
		JLabel number = new JLabel("0");
		
		f.add(minus);
		f.add(number);
		f.add(plus);
		
		minus.setBackground(Color.orange);
		plus.setBackground(Color.yellow);
		
		
		Font font = new Font("궁서", Font.BOLD, 100);
		Font font2 = new Font("한컴산뜻돋움", Font.BOLD, 50);
		number.setFont(font);
		
		minus.setFont(font2);
		plus.setFont(font2);
		
		
		minus.addActionListener(new ActionListener() { //무언가 반응을 함. addActionListener()
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("마이너스 버튼 누름.");
				count--;
				System.out.println(count);
				number.setText(count+""); //setText() 안에는 스트링만 넣을 수 있다, count는 정수이므로 ""을 더해서 스트링인척하자
			}
		});		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("플러스 버튼 누름.");
				count++;
				System.out.println(count);
				number.setText(count+""); //setText() 안에는 스트링만 넣을 수 있다, count는 정수이므로 ""을 더해서 스트링인척하자
			}
		});
		
		
		
		f.setVisible(true);//필수(마지막에 넣어줌)
		
		
		
		
	}

}
