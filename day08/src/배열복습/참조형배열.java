package 배열복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 참조형배열 {

	public static void main(String[] args) {

		JButton[] buttons = new JButton[500];
		
		for (int i = 0; i < buttons.length; i++) {
			//버튼생성 후, 배열에 넣자.
			JButton b = new JButton(i+"번"); //버튼 하나 만들어지고
			buttons[i] = b;//위 버튼이 배열에 들어간다.
			
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getSource());//어떤 버튼을 눌렀는지 알 수 있음.
					b.setBackground(Color.gray);//누르면 색깔 바뀜
					
				}
			});
		}
		
		
		
		//프레임생성
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		//플로우
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//프레임에 버튼올리기.
		for (int i = 0; i < buttons.length; i++) {
			f.add(buttons[i]);
		}
		
		
		
		
		
		f.setVisible(true);
		
		
	}

}
