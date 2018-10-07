package dev.backup.sachin;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmap {

	public static void main(String[] args) 
	{
	HashMap<Integer, String> hm= new HashMap<Integer,String>();
	hm.put(1, "sachin");
	hm.put(2, "ravi");
	hm.put(3, "raj");
	
	System.out.println(hm.get(1));
	System.out.println(hm.containsKey(3));
	for(Entry m: hm.entrySet())
	{
		System.out.println(m.getKey()+ " "+m.getValue());
	}
	HashMap<Integer, Employee> emp= new HashMap<Integer,Employee>();
	Employee e1= new Employee(1, "raj", "Admin");
	Employee e2= new Employee(1, "ravi", "testing");
	Employee e3= new Employee(1, "sachin", "devlop");
	
	emp.put(1, e1);
	emp.put(2, e2);
	emp.put(3, e3);
	
	for(Entry<Integer,Employee>m :emp.entrySet())
	{
	int key=m.getKey();
	
		Employee e=m.getValue();
		System.out.println(key + "info");
		System.out.println(e.id+" "+e.name+" "+e.dept);
		
	}
	

	}

}
