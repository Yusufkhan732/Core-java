package oop.rays.com;

public class Account {
	
	private String number;
	private String accountType;
	
	private double balance;
	private double deposite;
	private double withdrawal;
	private double fundTransfer;
	private Object payBill;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
		public void deposit(double deposite) {
			this.deposite = deposite;
			balance = balance + deposite;
		System.out.println("deposite amount:" + deposite);
		System.out.println("total balance:" + balance);
	}
		
		public void withdrawal(double withdrawal) {
			this.withdrawal = withdrawal;
			balance = balance - withdrawal;
			System.out.println("withdrawal amount:" + withdrawal);
			System.out.println("total balance:" + balance);
		}
		
		public void fundTransfer(double fundTransfer) {
			this.fundTransfer = fundTransfer;
			balance = balance - fundTransfer;
			System.out.println("fundtransfer:" + fundTransfer);
			System.out.println("total balance:" + balance);
		}
		
		public void payBill(double payBill) {
			this.payBill = payBill;
			balance = balance - payBill;
			System.out.println("bill amount:" + payBill);
			System.out.println("total balance:" + balance);
		
		}
	
	}

