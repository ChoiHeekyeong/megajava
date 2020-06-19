package 네트워크;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP서버 {

	public static void main(String[] args) throws Exception {

		// 승인용 소켓이 필요
		// 네트워크와 같은 외부연결은 무조건 예외처리!
		ServerSocket server = new ServerSocket(9100); // ()안에는 포트번호.
		// 포트를 설정하지 않으면, 5자리의 임의의 포트를 만들어서 전송됨
		System.out.println("TCP 서버 소켓 시작됨...");
		System.out.println("클라이언트의 연결을 기다리는 중...");

		int count = 0;// 연결된 클라이언트 수
		while (true) { // 무한루프
			// 데이터 전달용 소켓이 필요
			Socket sokcet = server.accept(); // 승인이 떨어지면(accept) 데이터전달용 소켓이 생성됨
			count++;
			System.out.println(count + "개의 클라이언트와 연결 성공!");
		}

	}

}
