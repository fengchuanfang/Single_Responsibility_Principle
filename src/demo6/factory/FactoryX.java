package demo6.factory;

//������Ʒ��
public class FactoryX implements IFactory{
	private Packaging packaging;

	public FactoryX(Packaging packaging) {
		this.packaging = packaging;
	}

	@Override
	public String process(String material) {
		return this.packaging.packaging(material)+ "��ƷX";
	}

}
