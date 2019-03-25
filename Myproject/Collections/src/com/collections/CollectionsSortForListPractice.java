package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortForListPractice {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		//al.add(null);
		al.add("Z");
		al.add("B");
		al.add("H");
		al.add("S");
		al.add("M");
		//al.add(10); ClassCastException
		//al.add(null); Nullpointer exception
		System.out.println("Before sorting" +al);
		Collections.sort(al);
		System.out.println("After sorting" +al);
	}

}
