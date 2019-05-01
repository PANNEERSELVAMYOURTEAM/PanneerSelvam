package cts.org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ListConcept {
	public static void  main(String[] args){
		List<Integer>l1=new LinkedList<Integer>();
		l1.add(0);
	boolean b  = l1.isEmpty();
	System.out.println(b);
	l1.add(2);
	l1.add(4);
	l1.add(4);
	l1.add(5);
	l1.add(3);
	System.out.println(l1);	
	Collection<Integer>l2=new ArrayList<Integer>();
	l2.addAll(l1);
	l2.add(20);
	l2.add(45);
	l2.add(46);
	System.out.println(l2);
	l2.retainAll(l1);
	System.out.println(l2);
	l2.remove(2);
	System.out.println(l2);
	List<String>l3 =new ArrayList<String>();
	l3.add("panneer");
	l3.add("selvam");
	l3.add("panneer");
	l3.add("panneerselvam");
	System.out.println(l3);
	l3.add(0, "value");
	System.out.println(l3);
	for (String duplicates : l3) {
		
			
		System.out.println(duplicates);
		
	}
	l1.removeAll(l2);
	System.out.println(l1);
int value = l3.indexOf("panneer");
	System.out.println(value);
	l3.set(2,"panneerSelvamJune@07");
	System.out.println(l3);
	Date d= new Date();
	String date = d.toString();
	System.out.println(date);
	


	
	
	
	
	
	}

}
