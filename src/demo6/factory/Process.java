package demo6.factory;

//�ӹ���
public class Process implements IProcess {
	private IPreProcess preProcess;

	public Process(IPreProcess preProcess) {
		this.preProcess = preProcess;
	}

	@Override
	public String process(String material) {
		return this.preProcess.preProcess(material) + "�ӹ�����>";
	}

}
