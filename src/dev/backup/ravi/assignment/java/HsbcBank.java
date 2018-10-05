
package dev.backup.ravi.assignment.java;

public class HsbcBank implements USBank
{
//if a class implementing any Interface,then its mandatory to define/override all method of	interface.
	
	@Override
	public void credit(){
		System.out.println("hsbc--credit");
	}
	@Override
	public void debit(){
		System.out.println("hsbc--debit");
	}
	@Override
	public void transferMoney(){
		System.out.println("hsbc--transferMoney");
	}
	
	public void educationLoan(){
		System.out.println("hsbc--edu loan");
	}
	public void carLoan(){
		System.out.println("hsbc--car loan");
	}

}
