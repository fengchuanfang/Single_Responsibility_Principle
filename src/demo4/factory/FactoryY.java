package demo4.factory;

public class FactoryY {
	private String preProcess(String material) {
		return "*" + material + "����>";
	}

	private String process(String material) {
		return preProcess(material) + "�ӹ�����>";
	}

	private String packaging(String material) {
		return process(material) + "��װ����>";
	}

	public String processY(String material) {
		return packaging(material) + "��ƷY";
	}

}
