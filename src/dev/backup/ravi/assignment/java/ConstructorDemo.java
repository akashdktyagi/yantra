package dev.backup.ravi.assignment.java;

public class ConstructorDemo {
	
	public ConstructorDemo(){
		System.out.println("Default--constru");
	}
	public ConstructorDemo(int i){
		System.out.println("single para--constru");
		System.out.println("the value of i="+i);
	}
	public ConstructorDemo(int i,int j){
		System.out.println("two para---constru");
		System.out.println("the value of i="+i);
		System.out.println("the value of j="+j);

	}
	
	public static void main(String[] args) {
		  ConstructorDemo obj = new ConstructorDemo();
		  ConstructorDemo obj1= new ConstructorDemo(10);
		  ConstructorDemo obj2= new ConstructorDemo(20,30);

	}

}
