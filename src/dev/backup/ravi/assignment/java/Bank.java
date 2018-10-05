package dev.backup.ravi.assignment.java;

public abstract class Bank {
	//partial abstraction
	//hiding the implementation logic is called abstraction.
	//abstract class can have abs. method and non abstract method.
	//can not create the object of abstract classes.
	
	public  abstract void loan();//abstract method---no method body.
	
	//non abstract method 
	public void credit(){
		System.out.println("Bank--credit");
	}
	public void debit(){
		System.out.println("Bank--debit");
	}
	
	
	
		
	

}
