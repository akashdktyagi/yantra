package dev.backup.ravi.assignment.java;
//Abstract class with abst method :-
public abstract class Animal {
	String name;
	String species;
	//constructor of the abstract class
	
	Animal(String n ,String s)
	{
		 name=n;
		 species=s;
	}
	void eat(String fooditem){
		System.out.println(species+""+name+ "likes to have" +fooditem);
	}
	abstract void sound();

}
