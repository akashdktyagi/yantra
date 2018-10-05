package dev.backup.ravi.assignment.testng;
// Program for method overloading
public class Demo
{
	void m1(int a,int b)
	{
		
		System.out.println("A="+a);
		System.out.println("B="+b);
		
	}
	void m1(double x)
	{
		System.out.println("X="+x);
		//System.out.println("Y="+y);
		
	}
	
	
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.m1(10, 20);
		
		Demo d2 = new Demo();
		d2.m1(10.2);
		
	}

}
