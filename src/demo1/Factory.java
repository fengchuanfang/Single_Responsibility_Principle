package demo1;

public class Factory {
	private String preProcess(String material){
        return "#"+material+"#";
    }
    public String processX(String material) {
        return preProcess(material) +"�ӹ��ɣ���ƷX";
    }

    public String processY(String material) {
        return preProcess(material) +"�ӹ��ɣ���ƷY";
    }
}
