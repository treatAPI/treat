package middleware;

public class Client {
	public static void main(String[] args) {
		InterfaceCalculator i = new Server();
		System.out.println(i.add(2, 3));
		System.out.println(i.sub(3, 2));
	}
}
