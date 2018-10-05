package dev.backup.ravi.assignment.java;

public class TestBank {
	
	
	
	public static void main(String[] args) {
		
		HsbcBank hs = new HsbcBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.educationLoan();
		
		System.out.println("************");
		
		//dynamic polymorphism:
		//child class object can be referred by parent Interface refernce variable.
		
	USBank b = new HsbcBank();
	
	b.credit();
	b.debit();
	b.transferMoney();
	
	System.out.println(USBank.min_bal);
	

	}

}
