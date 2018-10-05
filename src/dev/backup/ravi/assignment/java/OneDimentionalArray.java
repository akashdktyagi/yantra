package dev.backup.ravi.assignment.java;

public class OneDimentionalArray {

	public static void main(String[] args) {
		
 //Array: To store similar data type value in a array variable
		//int array:
		//lowest bound/index =0
		//upper bound/index = n-1(n is size of array)
		//1 dim array
		
 // dis. advantages array:-
		
     //1.size is fixed--static array--to overcome this problem--we use collection--ArrayList--HashTable
    //2.stores only similar data types--To overcome this problem--we use object array		
    
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundException
		
		System.out.println(i.length);//size/length of array
		//print all the values of array
		
		for(int j=0;j<i.length;j++){
		System.out.println(i[j]);
			
		}
		//1.Double array
		double d[] = new double[3];
		d[0] = 10.2;
		d[1] = 20.3;
		d[2] = 30.4;
		System.out.println(d[2]);
		
	   //2.char array
	   char c[] = new char[3];
	   c[0] = 'r';
	   c[1] = 2;
	   c[2] = '$';
	   System.out.println(c[2]);
	   
	   //3.boolean array 
	   boolean b[] = new boolean[2];
	   b[0] = true;
	   b[1] = false;
	   
	   //4.string array
	   String s[] = new String[3];
	   s[0] = "test";
	   s[1] = "hello";
	   s[2] = "world";
	   System.out.println(s[0]);
	   System.out.println(s.length);

	   
	   //5.object array: (object is a class)---is used to store diff data types values.
	   Object ob[] = new Object[6];
	   ob[0] =  "hello";
	   ob[1] =  123;
	   ob[2] =  'p';
	   ob[3] =  true;
	   ob[4] = 25;
	   ob[5] =  "1/1/1999";
	   System.out.println(ob[5]);
	   System.out.println(ob.length);
	}
}

	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
		
		
		
		
		
		
		
		



