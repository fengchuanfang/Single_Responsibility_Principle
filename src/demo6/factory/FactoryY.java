package demo6.factory;

//������Ʒ��
public class FactoryY implements IFactory{
	private Packaging packaging;

	public FactoryY(Packaging packaging) {
		this.packaging = packaging;
	}

	@Override
	public String process(String material) {
		return this.packaging.packaging(material)+ "��ƷY";
	}

}
