package demo4.factory;

public class FactoryX {
	private String preProcess(String material) {
		return "*" + material + "����>";
	}

	private String process(String material) {
		return preProcess(material) + "�ӹ�����>";
	}

	private String packaging(String material) {
		return process(material) + "��װ����>";
	}

	public String processX(String material) {
		return packaging(material) + "��ƷX";
	}

}
