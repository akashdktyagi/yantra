package dev.backup.ravi.assignment.java;

public class TestAbsrtactionclass {

	public static void main(String[] args) {
		
		Hdfc hb = new Hdfc();
		
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		
	Bank b = new Hdfc();
	   //child class obj.refferd by parent class refernce variable--dynamic polymorphism-->Run time poly.
		b.credit();
		b.debit();
		b.loan();
		
		

	}

}
