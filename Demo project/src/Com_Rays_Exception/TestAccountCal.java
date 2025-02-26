package Com_Rays_Exception;

import javax.naming.InsufficientResourcesException;

public class TestAccountCal {

	public static void main(String[] args) {

		System.out.println("before");
		Account acc = new Account();
		acc.setbalance(2000);
		acc.deposit(200);
	
		try {
			acc.withdraw(2500);

		} catch (InsufficientFundException e) {

			System.out.println(e);

		}

		acc.deposit(500);

		try {
			acc.withdraw(2500);

		} catch (InsufficientFundException e) {

			System.out.println(e);

		}

		System.out.println("after");
	}
}
