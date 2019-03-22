package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsBinaryCustomSort {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);
		System.out.println(al);
		Collections.sort(al, new MyComparator6());
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, 10, new MyComparator6()));
		System.out.println(Collections.binarySearch(al, 13, new MyComparator6()));
		System.out.println(Collections.binarySearch(al, 12, new MyComparator6()));
	}

}
class MyComparator6 implements Comparator
{

	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
	
}
