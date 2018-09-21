package dev.backup.sachin.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Binarysearch {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(14);
		list.add(25);
		list.add(21);
		Collections.sort(list);
		System.out.println(""+list);
		int intindex=Collections.binarySearch(list, 25);
		System.out.println(""+intindex);
		
		
	}

}
