package demo1;

public class Client {
	public static void main(String args[]) {
		Factory factory = new Factory();
		System.out.println(factory.processX("ԭ��"));
		System.out.println(factory.processY("ԭ��"));
	}
}
