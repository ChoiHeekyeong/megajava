package �迭����;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �������迭 {

	public static void main(String[] args) {

		JButton[] buttons = new JButton[500];
		
		for (int i = 0; i < buttons.length; i++) {
			//��ư���� ��, �迭�� ����.
			JButton b = new JButton(i+"��"); //��ư �ϳ� ���������
			buttons[i] = b;//�� ��ư�� �迭�� ����.
			
			buttons[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.out.println(e.getSource());//� ��ư�� �������� �� �� ����.
					b.setBackground(Color.gray);//������ ���� �ٲ�
					
				}
			});
		}
		
		
		
		//�����ӻ���
		JFrame f = new JFrame();
		f.setSize(1000,1000);
		//�÷ο�
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//�����ӿ� ��ư�ø���.
		for (int i = 0; i < buttons.length; i++) {
			f.add(buttons[i]);
		}
		
		
		
		
		
		f.setVisible(true);
		
		
	}

}
