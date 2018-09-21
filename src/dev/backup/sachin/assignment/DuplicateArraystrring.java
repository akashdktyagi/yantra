package dev.backup.sachin.assignment;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArraystrring {

	public static void main(String[] args) 
	{
		String str[]={"ravi","raj","sachin","kalyani","ravi"}; // string array
		//String str []={"10","20","30","10"};
		int len= str.length;
		
	    
		for( int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				// now i want to compare string which is equal or not
				if(str[i].equals(str[j]))
				{
					System.out.println("Duplicate elementis:"+str[i]);
				}
				
			}
		}
		//2 using HashSet it store uniqe value only o(n)
		Set<String> store=new HashSet<String>();    //Create set for storing duplicate element
		for (String str1 : str)
		{
		
			if(store.add(str1)==false)
			{
				System.out.println(str1);
				
			}
			
			
		}
		
		

	}

}
