package 네트워크;

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

public class 메신저B extends JFrame{
	//전역변수로 선언!
	JTextArea list;
	JTextField input;
	DatagramSocket socket;
	
	
	public 메신저B() throws Exception {
		socket = new DatagramSocket(6000);
		setTitle("메신저 B");
		list = new JTextArea(30,30);
		list.setEditable(false);
		input = new JTextField(20);
		add(list,BorderLayout.CENTER);
		add(input,BorderLayout.SOUTH);
		pack(); //알아서 크기계산해서 만들ㅇㅓ지는 메소드
		
		list.setBackground(Color.cyan);
		input.setBackground(Color.blue);
		
		Font font = new Font("궁서",1,30);
		list.setFont(font);
		input.setFont(font);
		
		
		//데이터 보내기
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//입력한 값을 가지고온다.
				String str = input.getText();
				input.setText("");
				//리스트에 올려주기.
				list.append("B가 입력>> "+str+"\n");
				
				//상대방에게 보내기.
				DatagramSocket socket;
				try {
					socket = new DatagramSocket();
					byte[] data = str.getBytes(); //스트링을 전송할 수 있는 형태인 바이트 타입으로 바꿔서.
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000); 
					socket.send(packet); //packet 안에 byte배열을 넣어서 보낸것.
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
			//상대방이 보낸 텍스트를 소켓으로 받는 부분
			//계속 돌아감
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data,data.length);
			socket.receive(packet);
			list.append("A가 입력>> "+new String(data)+"\n");
			//socket.close();
		}
		
	}
	
	
	public static void main(String[] args) {
		//리시브메소드가 먼저 실행되어있어야함.
		try {
			메신저B m = new 메신저B();
			m.Process();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
