package wrapper;
import java.net.*;
import java.util.*;

public class Sender {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your Message:");
		String str = scn.nextLine();
		
		DatagramSocket ds = new DatagramSocket();
		
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
		
		ds.send(dp);
		
		ds.close();
		
		System.out.println("Message sent to Receiver class. Please Check: "+str);
	}
}
