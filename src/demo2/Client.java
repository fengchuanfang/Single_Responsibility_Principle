package demo2;

import demo2.factory.AFactory;
import demo2.factory.FactoryX;
import demo2.factory.FactoryY;

public class Client {
	public static void main(String args[]) {
		produce(new FactoryX());
		produce(new FactoryY());
	}

	private static void produce(AFactory factory) {
		System.out.println(factory.process("‘≠¡œ"));
	}

}
