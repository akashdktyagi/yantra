package dev.backup.ravi.assignment.java;

public class ConstructorWithThisKeyword {
	//class vars
	String name;
	int age;
	int rollno;
	public ConstructorWithThisKeyword(String name , int age, int rollNo){
		this.name=name;
		this.age=age;
		this.rollno=rollNo;
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollNo);
		 
	}
	

	public static void main(String[] args) {
		ConstructorWithThisKeyword 	obj = new ConstructorWithThisKeyword("Ravi",30,101);

	}

}
