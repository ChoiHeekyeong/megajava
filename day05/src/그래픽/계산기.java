package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300,900);
		

		JLabel img = new JLabel();
		f.add(img);
		ImageIcon icon = new ImageIcon("cal.jpg");
		img.setIcon(icon);
		
		
	
		JLabel n1 = new JLabel("숫자 1");
		JLabel n2 = new JLabel("숫자 2");
		JLabel ans = new JLabel("0");
		//텍스트필드
		JTextField t1 = new JTextField(5); //5글자 넣을거임
		JTextField t2 = new JTextField(5);
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton 곱하기 = new JButton("*");
		JButton 나누기 = new JButton("/");
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		Font font = new Font("맑은 고딕",Font.BOLD,50);
		n1.setFont(font);
		n2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		곱하기.setFont(font);
		나누기.setFont(font);
		
		ans.setFont(font);
		
		f.add(n1);
		f.add(t1);
		
		f.add(n2);
		f.add(t2);
		
		f.add(plus);
		f.add(minus);
		f.add(곱하기);
		f.add(나누기);
		f.add(ans);
		
		
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.yellow);
		plus.setBackground(Color.pink);
		minus.setBackground(Color.pink);
		곱하기.setBackground(Color.pink);
		나누기.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		plus.setForeground(Color.red);
		minus.setForeground(Color.red);
		곱하기.setForeground(Color.red);
		나누기.setForeground(Color.red);
		
		
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//내가 입력한 두 수를 가지고 와야함..
				//num1 = t1에 쓴 값.
				String num1 = t1.getText(); //가져와야하니까 get.
				String num2 = t2.getText(); //가져와야하니까 get.
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				//더해서 출력해봅시다
				ans.setText((num11+num22)+"");
				
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String num1 = t1.getText(); //가져와야하니까 get.
				String num2 = t2.getText(); //가져와야하니까 get.
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				ans.setText((num11-num22)+"");
				
			}
		});
		
		곱하기.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String num1 = t1.getText(); //가져와야하니까 get.
				String num2 = t2.getText(); //가져와야하니까 get.
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				ans.setText((num11*num22)+"");
				
			}
		});
		나누기.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String num1 = t1.getText(); //가져와야하니까 get.
				String num2 = t2.getText(); //가져와야하니까 get.
				
				double num11 = Double.parseDouble(num1);
				int num22 = Integer.parseInt(num2);
				
				
				ans.setText((num11/num22)+"");
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
		
		
	}

}
