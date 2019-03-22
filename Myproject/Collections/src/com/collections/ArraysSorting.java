package com.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSorting {

	public static void main(String[] args) {

		int[] a= {10,5,20,11,6};
		System.out.println("Premitive array before sorting: ");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		Arrays.sort(a);
		System.out.println("Premitive array after sorting: ");
		for(int a1:a)
		{
			System.out.println(a1);
		}
		
		String[] s= {"A","Z","B"};
		System.out.println("Object array before sorting");
		for (String a2:s)
		{
			System.out.println(a2);
		}
		Arrays.sort(s);
		System.out.println("Object array After sorting");
		for(String a2:s)
		{
			System.out.println(a2);
		}
		
		Arrays.parallelSort(s, new MyComparartor7());
		System.out.println("Object array after sorting by comparartor");
		for(String a1:s)
		{
			System.out.println(a1);
		}
		
	}

}

class MyComparartor7 implements Comparator
{

	public int compare(Object o1, Object o2) {
		
		String s1=o1.toString();
		String s2=o2.toString();
		return s2.compareTo(s1);

	}
	
}
