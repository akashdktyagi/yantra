package dev.backup.vivek;

public class StringManipulation {

	public static void main(String[] args) {
      String str = "The rains have started here";
      String str1 ="The rains Have started here";

System.out.println(str.length());
System.out.println(str.charAt(5));
System.out.println(str.indexOf('s'));//1st occurrence of s
System.out.println(str.indexOf('s',str.indexOf('s')+1));//2nd occurrence s
System.out.println(str.indexOf("have"));
System.out.println(str.indexOf("hello"));//o/p :- -1

//string comparison
System.out.println(str.equals(str1));
System.out.println(str.equalsIgnoreCase(str1));

//substring
System.out.println(str.substring(0, 9)); 

//trim
String s= " hello world    ";
System.out.println(s.trim());
System.out.println(s.replace(" ", ""));

String date= "01-01-2017"; //01/01/2017
System.out.println(date.replace("-", "/"));























	}

}
