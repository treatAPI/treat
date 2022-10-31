import java.rmi.*;
import java.rmi.server.*;
public class HelloImpl extends UnicastRemoteObject implements IHello {
	public HelloImpl() throws RemoteException{
		
	}
	public String message() throws RemoteException{
		return("Hello");
	}
}
