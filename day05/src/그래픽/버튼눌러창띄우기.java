package �׷���;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ��ư����â���� {

	public static void main(String[] args) {


		JFrame f = new JFrame();
		f.setSize(400, 200);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton(" �� ");
		JButton b2 = new JButton("����");
		
		f.add(b1);//�����ӿ� ��ư����
		f.add(b2);
		
		Font font = new Font("�ü�",Font.BOLD,50);
		b1.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.YELLOW);
		b2.setBackground(Color.pink);
		b1.setForeground(Color.blue);
		b2.setForeground(Color.red);
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "�����ؿ�!!!");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "�ʹ� ������!!!!!!!");
			}
		});
		
		
		
		
		f.setVisible(true);//�ʼ�

	}

}
