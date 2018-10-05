package dev.backup.ravi.assignment.testng.billpayment;

//Program for constructor and also implement "static" keyword

public class Sample1
{

	int id;
	String name;
	static String  college ="IBSS";
	
	Sample1(int id , String name)
	{
		System.out.println(""+id +    ""+name  + ""+college);
	}

	public static void main(String[] args) 
	{
		Sample1 s = new Sample1(101 , "RAVI");
		Sample1 s1 = new Sample1(102 , "SACHIN");

		
		
	}

}
