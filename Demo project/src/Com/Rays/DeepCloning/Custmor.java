package Com.Rays.DeepCloning;

public class Custmor implements Cloneable {

	public String Name;
	public Account account = null;

	public Custmor(String Name, Account account) {
		this.Name = Name;
		this.account = account;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Custmor c = (Custmor) super.clone();
		c.account = (Account) c.account.clone();
		return c;

	}
}