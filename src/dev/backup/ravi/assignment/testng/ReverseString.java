package dev.backup.ravi.assignment.testng;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Hello world";
		//1.using for loop
		int len = s.length();
		String rev = "";
		for(int i=len-1;i>0;i--){
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		//using string BufferClass
		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());
		

	}

}
