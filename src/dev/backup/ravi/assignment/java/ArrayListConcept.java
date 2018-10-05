package dev.backup.ravi.assignment.java;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListConcept {

	public static <E> void main(String[] args) {
		/*int a[] = new int[3];//static array :-size is fix
		
		//dynamic array :- arrayList
		//1. can contain duplicate values/element
		//2. maintains insertion order
		//3. synchronized
		//4. allows random access to fetch the element because it store the values on the basis of indexes
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		System.out.println(ar.size());
		ar.add("test");
		ar.add('a');
		ar.add("true");
		System.out.println(ar.size());//size of array List
		System.out.println(ar.get(5));//to get the value from an index
		System.out.println("**************");
		
		//to print all value of array list:
		 //1.using for loop
		 //2.using Iterator
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i)); 
		}
			
	//non generic vs generic		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("selenium");
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("selenium");
		ar2.add("manual");
		ArrayList<E> ar3 = new ArrayList<E>();//add this E main method*/
		
		//Employee class object:
		Employee e1 = new Employee("ravi", 28, "QA");
		Employee e2 = new Employee("abhi", 24, "BDE");
		Employee e3 = new Employee("sidhesh", 24, "DGE");
		System.out.println(""+e1);
		//create array list:
		ArrayList<Employee> e4 = new ArrayList<Employee>();
		e4.add(e1);
		e4.add(e2);
		e4.add(e3);
		
		//iterator to traverse the value:
		Iterator<Employee> it = e4.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.dept);
			System.out.println(emp.age);
		}
		System.out.println("************");
		
		
			//addAll():
			ArrayList<String> ar5 = new ArrayList<String>();
			ar5.add("selenium");
			ar5.add("manual");
			ar5.add("qtp");
			
			ArrayList<String> ar6 = new ArrayList<String>();
			ar6.add("dev");
			ar6.add("java");
			ar6.add("javascript");
			
			ar5.addAll(ar6);
			for(int i=0;i<ar5.size();i++){
				System.out.println(ar5.get(i));
			}
			System.out.println("**************");
				//removeAll
				ar5.removeAll(ar6);
				for(int i=0;i<ar5.size();i++){
					System.out.println(ar5.get(i));
					
				}
				
			}}
			
			
			
			
		
		
		
		
		
	
		
		
		
		
		
		
		

	


