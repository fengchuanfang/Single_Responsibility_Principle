package demo5;

import demo5.factory.Factory;

public class Client1 {

	public static void main(String[] args) {
		Factory factory = new Factory();
		System.out.println(factory.processX("‘≠¡œ"));
	}

}
