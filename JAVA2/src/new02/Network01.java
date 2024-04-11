package new02;

import java.io.IOException;
import java.net.InetAddress;

public class Network01 {

	public static void main(String[] args) throws IOException {
		InetAddress ip = null;
		ip = InetAddress.getByName("www.naver.com");
		System.out.println("HostAddress>" + ip.getHostAddress());
		System.out.println("HostName>" + ip.getHostName());
	}

}
