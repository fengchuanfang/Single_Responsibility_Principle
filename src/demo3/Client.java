package demo3;

import demo3.factory.Factory;

public class Client {

	public static void main(String[] args) {
		Factory factory = new Factory();
		System.out.println(factory.processX("‘≠¡œ"));
	}

}
