package Com.Rays.DeepCloning;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account acc = new Account(100);

		Custmor c1 = new Custmor("abc", acc);
		Custmor c2 = (Custmor) c1.clone();
		System.out.println(c1.Name);
		System.out.println(c1.account.balance);

		c2.Name = "xyz";
		c2.account.balance = 200;
		System.out.println(c2.Name);
		System.out.println(c2.account.balance);

	}
}