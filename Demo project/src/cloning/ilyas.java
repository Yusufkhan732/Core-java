package cloning;

public class ilyas implements Cloneable {

	public String haseem;

	public ilyas(String haseem) {
		this.haseem = haseem;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
