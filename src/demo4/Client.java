package demo4;

import demo4.factory.Factory;

public class Client {

	public static void main(String[] args) {
		Factory factory = new Factory();
		System.out.println(factory.processX("ԭ��"));
		System.out.println(factory.processY("ԭ��"));
	}

}
