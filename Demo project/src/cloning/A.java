package cloning;

public class A implements Cloneable {

	public String name;

	public A(String name) {
		this.name = name;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
