package dev.backup.ravi.assignment.testng;

// Program use for local variable

public class Sample
{
	//int a=10;  // 
  void m1()
  {
	 int a=10; //local varible manadatory to initialize
	 int b=20;
	 int c=a+b;
	 
	  System.out.println("A="+ a);
	  System.out.println("B=" +b);
	 System.out.println("c="+c);
  }
	
	public static void main(String[] args) 
	{
       Sample s = new Sample();
       s.m1();
	}

}
