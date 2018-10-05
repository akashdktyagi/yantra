package dev.backup.ravi.assignment.java;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		
		System.out.println("********");
		
		Car c = new Car(); //Dynamic polymorphism---Run time poly.--create obj BMW
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("********");
		
			
		

	}

}
