package dev.backup.ravi.assignment.java;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
  
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("selenium");
		ll.add("qtp");
		
		//print
		System.out.println("content of linkedlist:"+ll);
		//add first
		ll.addFirst("Ravi");
		//add last
		ll.addLast("Automation");
		System.out.println("content of linkedlist:"+ll);
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Nayan");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linked list:"+ll);
		
		//ll.remove(2);
		System.out.println("content of linked list"+ll);
		
		//how to print all the values of linked list
		
		//1.for loop
		System.out.println("*****using for loop");
		for(int i=0;i<ll.size();i++){
		System.out.println(ll.get(i));
		}
		System.out.println("****using advance for loop");
		for(String str: ll){
		System.out.println(str);
		}
		
		System.out.println("******using iterator");
	    Iterator<String> it  =  ll.iterator();
	    while(it.hasNext()){
	    System.out.println(it.next());
	}
		
		
		
		
		
		
		
		
		
	}

}
