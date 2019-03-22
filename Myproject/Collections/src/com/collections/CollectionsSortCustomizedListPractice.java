package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortCustomizedListPractice {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add("Z");
		al.add("B");
		al.add("H");
		al.add("S");
		System.out.println("Before sorting" +al);
		Collections.sort(al,new MyComparator5());
		System.out.println("After sorting" +al);
	}

}

class MyComparator5 implements Comparator
{

	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);
	}
	
}
