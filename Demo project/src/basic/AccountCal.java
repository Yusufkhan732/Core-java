package basic;

public class AccountCal {

	public static void main(String[] args) {

		System.out.println("before");

		Account a = new Account();
		a.setNumber("HDFC1122334");
		System.out.println(a.getNumber());
		a.setAccountType("saving");
		System.out.println(a.getAccountType());
		a.setBalance(1000);
		a.Diposit(200);

		try {
			a.withdraw(1300);

		} catch (InsufficiantfundException e) {
			System.out.println(e);

		}
		a.Diposit(500);

		try {
			a.withdraw(800);

		} catch (InsufficiantfundException e) {
			System.out.println(e);
		}
		System.out.println("after");

	}

}
