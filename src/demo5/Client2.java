package demo5;

import demo5.factory.Factory;

public class Client2 {

	public static void main(String[] args) {
		Factory factory = new Factory();
		System.out.println(factory.packaging("ԭ��"));
	}

}
