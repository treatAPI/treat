import java.rmi.Naming;
public class HelloClient {
	private static final String host  = "localhost";
	public static void main(String[] args) {
		try {
			IHello greeting_message = (IHello) Naming.lookup("rmi://"+host+"/Hello");
			
			System.out.println("Message Received: "+greeting_message.message());
		} catch (Exception e) {
			System.out.println(e);
			System.exit(1);
		}
	}
}
