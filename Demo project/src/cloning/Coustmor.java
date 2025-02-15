package cloning;

public class Coustmor implements Cloneable {

	public String name;
	public Account account = null;

	public Coustmor(String name, Account account) {
		this.name = name;
		this.account = account;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Coustmor c = (Coustmor) super.clone();
		c.account = (Account) c.account.clone();

		return c;
	}

}
