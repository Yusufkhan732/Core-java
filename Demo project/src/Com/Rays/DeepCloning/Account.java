package Com.Rays.DeepCloning;

public class Account implements Cloneable {

	public int balance;

	public Account(int Balance) {

		this.balance = Balance;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}