package demo4;

import demo4.factory.Factory;

public class Client {

	public static void main(String[] args) {
		Factory factory = new Factory();
		System.out.println(factory.processX("原料"));
		System.out.println(factory.processY("原料"));
	}

}
