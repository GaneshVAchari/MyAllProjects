package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		return -s1.compareTo(s2);
	}
	
}

public class TreesetPractice3 {

	public static void main(String[] args) {
		// program to add string objects where all elements should be inserted according to revrse of alphabetical order

		TreeSet t=new TreeSet(new MyComparator1());
		t.add("Ganesh");
		t.add("Achari");
		t.add("Satish");
		t.add("Venkatesh");
		
		System.out.println(t);
		
	}

}
