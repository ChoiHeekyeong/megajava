package ��Ʈ��ũ;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP���� {

	public static void main(String[] args) throws Exception {

		// ���ο� ������ �ʿ�
		// ��Ʈ��ũ�� ���� �ܺο����� ������ ����ó��!
		ServerSocket server = new ServerSocket(9100); // ()�ȿ��� ��Ʈ��ȣ.
		// ��Ʈ�� �������� ������, 5�ڸ��� ������ ��Ʈ�� ���� ���۵�
		System.out.println("TCP ���� ���� ���۵�...");
		System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ��� ��...");

		int count = 0;// ����� Ŭ���̾�Ʈ ��
		while (true) { // ���ѷ���
			// ������ ���޿� ������ �ʿ�
			Socket sokcet = server.accept(); // ������ ��������(accept) ���������޿� ������ ������
			count++;
			System.out.println(count + "���� Ŭ���̾�Ʈ�� ���� ����!");
		}

	}

}
