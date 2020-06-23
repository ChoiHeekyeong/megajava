package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) throws Exception {
		//URL url = new URL("http://www.naver.com");
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		System.out.println(ip);
	}

}
