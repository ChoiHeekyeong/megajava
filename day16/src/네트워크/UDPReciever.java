package ��Ʈ��ũ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReciever {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7000); //sender���� ������ ��Ʈ��ȣ 7000�� �־���.
		System.out.println("�޴� �� ���� ����........");
		System.out.println("���� �غ� ��. ��ٸ��� ��......"); //���ù����� ������Ѽ� �����غ� �ϰ��ִ´�.
		
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data,data.length);
		socket.receive(packet);
		System.out.println(new String(data)); //String���� �ٲ���� ��°���.
		socket.close();
	}

}
