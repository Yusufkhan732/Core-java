package Com.Rays.Shallow_Cloning;

public class TestShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Account a1 = new Account(100);

		Account a2 = (Account) a1.clone();
		a2.Balance = 200;

		System.out.println(a1.Balance);
		System.out.println(a2.Balance);
		
	}
}
