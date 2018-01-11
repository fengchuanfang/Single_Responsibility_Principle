package demo2.factory;

public abstract class AFactory {
	
	protected abstract String preProcess(String material);

	public abstract String process(String material);
}
