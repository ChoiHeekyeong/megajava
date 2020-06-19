package 네트워크;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP클라이언트 {

	public static void main(String[] args) throws Exception {

		Socket socket = new Socket("localhost",9100);
		System.out.println("클라이언트1: 서버와 연결 성공!");
		
		
	}

}
