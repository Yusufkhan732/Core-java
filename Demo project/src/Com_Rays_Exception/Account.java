package Com_Rays_Exception;

public class Account {

	public double balance;

	public double getbalance() {
		return balance;

	}

	public void setbalance(int balance) {
		this.balance = balance;
	}

	  // deposit method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposit " + amount);
		System.out.println("new balance" + balance);

	}
          //withdraw method
	public void withdraw(double amount) throws InsufficientFundException {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("withdraw" + amount);
			System.out.println("reamining" + balance);
		} else if (amount > balance) {
			InsufficientFundException e = new InsufficientFundException(
					"Insufficient Fund.avialable balance" + balance);
			throw e;

		}

	}

}
