package demo2.factory;

public class FactoryY extends AFactory {

	@Override
	protected String preProcess(String material) {
		return "*" + material + "*";
	}

	@Override
	public String process(String material) {
		return preProcess(material) + "�ӹ��ɣ���ƷY";
	}

}
