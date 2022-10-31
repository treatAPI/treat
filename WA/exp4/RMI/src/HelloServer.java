import java.rmi.*;
public class HelloServer {
	private static final String host = "localhost";
	public static void main(String[] args) throws Exception{
		HelloImpl temp = new HelloImpl();
		
		String rmiObjectName = "rmi://"+host+"/Hello";
		Naming.rebind(rmiObjectName, temp);
		
		System.out.println("Binding Complete...\n");
	}
}
