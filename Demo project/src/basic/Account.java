package basic;

public class Account {

	public double balance;
	public String number;
	public String AccountType;

	public void setAccountType(String AccountType) {
		this.AccountType = AccountType;

	}

	public String getAccountType() {
		return AccountType;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;

	}

	public void setBalance(int balance) {
		this.balance = balance;

	}

	public double getbalance() {
		return balance;

	}

	public void Diposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit " + amount);
		System.out.println("new balance " + amount);

	}

	public void withdraw(double amount) throws InsufficiantfundException {
		if (amount > 0 && amount <= balance) {
			balance = balance - amount;
			System.out.println("withdraw " + amount);
			System.out.println("new balance " + balance);
		} else if (amount > balance) {

			InsufficiantfundException e = new InsufficiantfundException("Insufficiant Fund  available.balance");

			throw e;

		}

	}

}
