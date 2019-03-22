package com.collections;

import java.util.TreeSet;

public class TreesetPractice1 {
	public static void main(String args[])
	{
		TreeSet t=new TreeSet();
		t.add("A"); 
		t.add("a"); // "A" will display before "a" because unicode of A is smaller than "a"
		t.add("B");
		t.add("C");
		t.add("D");
		t.add("D");
		//t.add(new Integer(10)); //To check heterogeneous is not allowed( "classCastexception")
		//t.add(null); // Valid till 1.6
		//t.add(null);
		System.out.println(t);
		
	}

}
