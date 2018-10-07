package dev.backup.sachin;

public class StringReverse {

	public static void main(String[] args)
	{
		String str="sachinjadhv";                        //this is string i want to reverse   (sachinjadhavindex=0to10)
		int len=str.length();                           // find the length of string (len=11)
		String rev=" ";
		for(int i=len-1;i>=0;i--)                      // loop should start from m that is 10 index and with index0
		{
			rev=rev+str.charAt(i);                    // reverse methode is not avilable in string class becouse it is imutable class
			//System.out.println(rev);
		}
		System.out.println(rev);
		
		StringBuffer sf=new StringBuffer(str);     // in stringbuffer class reverse function is avilable
		System.out.println(sf.reverse());
  	}

}
