package oop.rays.com;

public class AcccountCal {
	
	public static void main(String[] args) {
		
		
		Account a = new Account();
		a.setNumber("BOI112334");
		System.out.println(a.getNumber());
		
		a.setAccountType("saving");
		System.out.println(a.getAccountType());
		
		a.setBalance(1000);
		System.out.println(a.getBalance());
	
	     a.deposit(200);
	     System.out.println(200);
	     
	     a.withdrawal(500);
	     
	     System.out.println(500);
	     a.fundTransfer(400);
	     System.out.println(400);
	     
	     a.payBill(200);
	     System.out.println(200);
		
	}

}
