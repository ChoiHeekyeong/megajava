package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 버튼눌러창띄우기 {

	public static void main(String[] args) {


		JFrame f = new JFrame();
		f.setSize(400, 200);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton(" 봄 ");
		JButton b2 = new JButton("여름");
		
		f.add(b1);//프레임에 버튼띄우기
		f.add(b2);
		
		Font font = new Font("궁서",Font.BOLD,50);
		b1.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.YELLOW);
		b2.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.red);
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "선선해요!!!");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "너무 더워요!!!!!!!");
			}
		});
		
		
		
		
		f.setVisible(true);//필수

	}

}
