package 그래픽;



import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 내첫윈도우 {

	public static void main(String[] args) {
		//창 큰거 한번 띄워보자.
	
		JFrame f = new JFrame(); //jfr
		f.setSize(500, 500);//프레임 사이즈정하기
		
		//버튼 만들어서 창에서 넣어보자.
		JButton b = new JButton();//버튼 생성
		b.setText("나를 눌러요");
		b.setBackground(Color.yellow);//버튼 색깔
		b.setForeground(Color.blue);//글자 색깔
		
		f.add(b);//frame에 버튼 넣기.

		
		
		
		JButton b2 = new JButton();
		b2.setText("나도 눌러요");
		b2.setBackground(Color.pink);
		b2.setForeground(Color.red);
		f.add(b2);
		
		FlowLayout flow = new FlowLayout();//버튼두개를 나란히 할 수 있게해줌
		f.setLayout(flow);
		
		
		
		f.setVisible(true);//이게 없으면 창을 생성해도 안보임. //프레임이 계속 보이게 하면서 떠있는 것 //얘는 아래에 있어야함.
		
		
		
		
		
		
		
	}

}
