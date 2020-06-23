package ��Ʈ��ũ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class �޽���B extends JFrame{
	//���������� ����!
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	
	public �޽���B() throws Exception {
		socket = new DatagramSocket(6000);
		setTitle("�޽��� B");
		list = new JTextArea(30,30);
		list.setEditable(false);
		input = new JTextField(20);
		add(list,BorderLayout.CENTER);
		add(input,BorderLayout.SOUTH);
		pack(); //�˾Ƽ� ũ�����ؼ� ���餷������ �޼ҵ�
		
		list.setBackground(Color.cyan);
		input.setBackground(Color.blue);
		
		Font font = new Font("�ü�",1,30);
		list.setFont(font);
		input.setFont(font);
		
		
		//������ ������
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//�Է��� ���� ������´�.
				String str = input.getText();
				input.setText("");
				//����Ʈ�� �÷��ֱ�.
				list.append("B�� �Է�>> "+str+"\n");
				
				//���濡�� ������.
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes(); //��Ʈ���� ������ �� �ִ� ������ ����Ʈ Ÿ������ �ٲ㼭.
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000); 
					socket.send(packet); //packet �ȿ� byte�迭�� �־ ������.
					socket.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
		
		setVisible(true);
		
		
	}
	
	public void Process() throws Exception {
		while (true) {
			//������ ���� �ؽ�Ʈ�� �������� �޴� �κ�
			//��� ���ư�
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			socket.receive(packet);
			list.append("A�� �Է�>> "+new String(data)+"\n");
			//socket.close();
		}
		
	}
	
	
	public static void main(String[] args) {
		//���ú�޼ҵ尡 ���� ����Ǿ��־����.
		try {
			�޽���B m = new �޽���B();
			m.Process();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
