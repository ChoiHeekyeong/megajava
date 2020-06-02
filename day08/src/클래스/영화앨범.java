package 클래스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 영화앨범 {

	static int now = 2; // 배열의 현재 위치를 알려주는 변수

	public static void main(String[] args) {
		// 영화 이미지 배열 선언
		String[] list = { "002.png", "003.png", "004.png", "005.png", "006.png" };
		//영화 이름 배열 선언
		String[] title = {" 언더워터 ","프리즌 이스케이프","위대한 쇼맨","카페 벨에포크","미스비헤이비어"};
		
		// 프레임
		JFrame f = new JFrame();
		// 제이라벨
		JLabel label1 = new JLabel();//사진 넣는 라벨
		JLabel label2 = new JLabel();//영화제목 넣는 라벨
		// 플로우레이아웃
		FlowLayout flow = new FlowLayout();
		// 제이버튼
		JButton left = new JButton("<<<<");
		JButton right = new JButton(">>>>");

		f.setSize(300, 550);
		f.setLayout(flow);

		f.add(label1);
		f.add(label2);
		f.add(left);
		f.add(right);

		// img아이콘
		ImageIcon icon = new ImageIcon(list[now]);
		label1.setIcon(icon);
		label2.setText(title[now]);
		
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(now>0) { //1~4까지만 1씩 줄일 수있게!
					now--;// 연산에서 에러나면 now변수를 main밖에 static으로 만들어줌
				}
				else {
					now = 4;
				}
				ImageIcon icon = new ImageIcon(list[now]);
				label1.setIcon(icon);
				label2.setText(title[now]);
			}
		});

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(now<4) {
					now++;
				}
				else {
					now = 0;
				}
				ImageIcon icon = new ImageIcon(list[now]);
				label1.setIcon(icon);
				label2.setText(title[now]);
			}
		});

		// font
		Font font = new Font("궁서", Font.BOLD, 50);
		Font font2 = new Font("궁서", Font.BOLD, 20);
		label2.setFont(font2);
		left.setFont(font);
		right.setFont(font);
		left.setBackground(Color.YELLOW);
		right.setBackground(Color.YELLOW);
		left.setForeground(Color.red);
		right.setForeground(Color.blue);

		f.setVisible(true);

	}

}
