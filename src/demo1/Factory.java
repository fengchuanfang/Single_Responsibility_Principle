package demo1;

public class Factory {
	private String preProcess(String material){
        return "#"+material+"#";
    }
    public String processX(String material) {
        return preProcess(material) +"加工成：产品X";
    }

    public String processY(String material) {
        return preProcess(material) +"加工成：产品Y";
    }
}
