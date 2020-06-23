package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// 네트워크 연결 전송하기 위해서는 class필요(전화기역할을 하는 Socket)
		DatagramSocket socket = new DatagramSocket();
		String str = "I am a JAVA Programmer!";
		// 데이터+주소(ip+port)를 가지고 packet!
		byte[] data = str.getBytes(); //스트링을 전송할 수 있는 형태인 바이트 타입으로 바꿔서.
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7000); //7000=port
		socket.send(packet); //packet 안에 byte배열을 넣어서 보낸것.
		socket.close();

	}

}
