package demo6;

import demo6.factory.FactoryX;
import demo6.factory.FactoryY;
import demo6.factory.IFactory;
import demo6.factory.IPackaging;
import demo6.factory.Packaging;
import demo6.factory.Process;
import demo6.factory.PreProcess;
import demo6.factory.PreProcessA;
import demo6.factory.PreProcessB;

public class Client {

	public static void main(String[] args) {
		IFactory factoryX = new FactoryX(new Packaging(new Process(new PreProcessB())));
		System.out.println(factoryX.process("原料"));
		IFactory factoryY = new FactoryY(new Packaging(new Process(new PreProcess())));
		System.out.println(factoryY.process("原料"));
		IPackaging packagingX = new Packaging(new Process(new PreProcessA()));
		System.out.println(packagingX.packaging("原料"));
	}
}
