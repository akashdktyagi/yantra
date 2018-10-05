package dev.backup.ravi.assignment.testng.billpayment;

public class InstanceVariable {
	
	
	int i=10;
	int j=20;
	
	
	void m1()
	{
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args)
	{
		InstanceVariable obj1 = new InstanceVariable();
		InstanceVariable obj2 = new InstanceVariable();

		obj1.m1();
		obj2.m1 ();

	}

}

