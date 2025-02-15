package cloning;

public class TestDeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account acc = new Account(100);

		Coustmor c1 = new Coustmor("yusuf", acc);
		Coustmor c2 = (Coustmor) c1.clone();

		c2.name = "khan";
		c2.account.Balance = 200;
		System.out.println(c2.name);
		System.out.println(c2.account.Balance);

		System.out.println(c1.name);
		System.out.println(c1.account.Balance);

	}

}
