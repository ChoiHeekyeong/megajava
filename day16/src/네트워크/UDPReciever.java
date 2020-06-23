package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReciever {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7000); //sender에서 설정한 포트번호 7000을 넣어줌.
		System.out.println("받는 쪽 소켓 시작........");
		System.out.println("받을 준비 끝. 기다리는 중......"); //리시버부터 실행시켜서 받을준비를 하고있는다.
		
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data,data.length);
		socket.receive(packet);
		System.out.println(new String(data)); //String으로 바꿔야지 출력가능.
		socket.close();
	}

}
