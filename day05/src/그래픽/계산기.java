package �׷���;

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

public class ���� {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300,900);
		

		JLabel img = new JLabel();
		f.add(img);
		ImageIcon icon = new ImageIcon("cal.jpg");
		img.setIcon(icon);
		
		
	
		JLabel n1 = new JLabel("���� 1");
		JLabel n2 = new JLabel("���� 2");
		JLabel ans = new JLabel("0");
		//�ؽ�Ʈ�ʵ�
		JTextField t1 = new JTextField(5); //5���� ��������
		JTextField t2 = new JTextField(5);
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton ���ϱ� = new JButton("*");
		JButton ������ = new JButton("/");
		
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		
		Font font = new Font("���� ���",Font.BOLD,50);
		n1.setFont(font);
		n2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		plus.setFont(font);
		minus.setFont(font);
		���ϱ�.setFont(font);
		������.setFont(font);
		
		ans.setFont(font);
		
		f.add(n1);
		f.add(t1);
		
		f.add(n2);
		f.add(t2);
		
		f.add(plus);
		f.add(minus);
		f.add(���ϱ�);
		f.add(������);
		f.add(ans);
		
		
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.yellow);
		plus.setBackground(Color.pink);
		minus.setBackground(Color.pink);
		���ϱ�.setBackground(Color.pink);
		������.setBackground(Color.pink);
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		plus.setForeground(Color.red);
		minus.setForeground(Color.red);
		���ϱ�.setForeground(Color.red);
		������.setForeground(Color.red);
		
		
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���� �Է��� �� ���� ������ �;���..
				//num1 = t1�� �� ��.
				String num1 = t1.getText(); //�����;��ϴϱ� get.
				String num2 = t2.getText(); //�����;��ϴϱ� get.
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				//���ؼ� ����غ��ô�
				ans.setText((num11+num22)+"");
				
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				String num1 = t1.getText(); //�����;��ϴϱ� get.
				String num2 = t2.getText(); //�����;��ϴϱ� get.
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				ans.setText((num11-num22)+"");
				
			}
		});
		
		���ϱ�.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String num1 = t1.getText(); //�����;��ϴϱ� get.
				String num2 = t2.getText(); //�����;��ϴϱ� get.
				
				int num11 = Integer.parseInt(num1);
				int num22 = Integer.parseInt(num2);
				
				ans.setText((num11*num22)+"");
				
			}
		});
		������.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String num1 = t1.getText(); //�����;��ϴϱ� get.
				String num2 = t2.getText(); //�����;��ϴϱ� get.
				
				double num11 = Double.parseDouble(num1);
				int num22 = Integer.parseInt(num2);
				
				
				ans.setText((num11/num22)+"");
				
			}
		});
		
		
		
		
		
		f.setVisible(true);
		
		
	}

}
