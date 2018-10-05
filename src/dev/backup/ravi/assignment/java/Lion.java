package dev.backup.ravi.assignment.java;

public class Lion extends Animal{
	
	Lion(){
//the super keyword used to set up an explicit call to the parent class constructor.
		super("Lion", "Asiatic Lion");
	}
//It is mandatory for the subclass Lion to override the sound method because the sound() method
	//has been declared by the parent class.
	
	@Override
	void sound() {
		System.out.println("Lions Roar!Roar!");
		
	}
	public static void main(String[] args) {
		
		Lion l = new Lion();
		l.eat("flesh");//this method of the parent class will be called with the help of obj created.
		
		l.sound();


	}}
