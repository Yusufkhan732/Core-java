package Com.Rays.Cloning;

public class Account implements Cloneable {

	public int Balance;

	public Account(int Balance) {
		this.Balance = Balance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
