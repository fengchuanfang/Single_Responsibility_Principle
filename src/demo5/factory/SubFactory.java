package demo5.factory;

public class SubFactory {
	private String preProcess(String material) {
		return "*" + material + "����>";
	}

	private String process(String material) {
		return preProcess(material) + "�ӹ�����>";
	}

	public String packaging(String material) {
		return process(material) + "��װ����>";
	}
}
