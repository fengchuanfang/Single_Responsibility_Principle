package demo6.factory;

//ԭ��Ԥ������
public class PreProcessA implements IPreProcess{

	@Override
	public String preProcess(String material) {
		return "#" + material + "����>";
	}

}
