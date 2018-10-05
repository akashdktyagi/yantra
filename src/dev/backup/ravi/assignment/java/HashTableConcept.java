package dev.backup.ravi.assignment.java;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
	//It is similar to HashMap , bt it is synchronised.
	//stores the value on the basis of key-value.
	//key--object--HashCode-->value

	public static void main(String[] args) {
		
		Hashtable h1 = new 	Hashtable();
		h1.put(1, "Shree");
		h1.put(2, "Ravi");
		h1.put(3, "Sachin");
	
		Hashtable h2 = new Hashtable();
		
		//create a clone copy //shallow copy
	    h2=(Hashtable)h1.clone();
	    System.out.println("the values from h1"+h1);
	    System.out.println("the values from h2"+h2);
	    
    //contains a value
	    Hashtable st  = new Hashtable();
	    
	    st.put("A", "nayan");
	    st.put("B", "selenium");
	    st.put("C", "qtp");
	    if(st.containsValue("nayan"));
	    System.out.println("value is found");
	    
	    //print all the values hashtable using--enumeration----elements():	    
	    Enumeration e = st.elements();
	    System.out.println("print values from st using enumeration");
	   
	   while(e.hasMoreElements()){
	   System.out.println(e.nextElement());
	   }
	   //get all the values from hashtable using---emptyset()---set of hashtable values:
	   System.out.println("print value from st using entry set");
	   
	   Set s = st.entrySet();
	   System.out.println(s);
	   
	   Hashtable st1  = new Hashtable();
	   
	    st1.put("A", "nayan");
	    st1.put("B", "selenium");
	    st1.put("C", "qtp");
	    st1.put("C", "qtp");//it contains only unique value //no null key and null value

	    System.out.println("values frome st1:");
	    System.out.println(st1);
	    
	    
	    //check all the hashtable equal or not
	    if(st.equals(st1))
	    	System.out.println("both are equal");
	    
	    //get the values from key
	    System.out.println(st1.get("A"));
	    
	    //get the hashcode of Hashtable object:
	    System.out.println("the hashcode values of st1:"+st1.hashCode());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	    
	    


	    
 
		


		
	

		

	}

		
	}


