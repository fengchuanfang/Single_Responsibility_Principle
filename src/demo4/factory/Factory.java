package demo4.factory;

public class Factory {

	private String preProcess(String material) {
		return "*" + material + "——>";
	}

	private String process(String material) {
		return preProcess(material) + "加工——>";
	}

	private String packaging(String material) {
		return process(material) + "包装——>";
	}

	public String processX(String material) {
		return packaging(material) + "产品X";
	}

	public String processY(String material) {
		return packaging(material) + "产品Y";
	}

}
