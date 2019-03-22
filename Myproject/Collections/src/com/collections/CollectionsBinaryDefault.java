package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsBinaryDefault {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
		System.out.println(al);
		//Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "K"));
		System.out.println(Collections.binarySearch(al, "J"));
	}

}
