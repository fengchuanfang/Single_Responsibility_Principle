package demo2.factory;

public class FactoryY extends AFactory {

	@Override
	protected String preProcess(String material) {
		return "*" + material + "*";
	}

	@Override
	public String process(String material) {
		return preProcess(material) + "加工成：产品Y";
	}

}
