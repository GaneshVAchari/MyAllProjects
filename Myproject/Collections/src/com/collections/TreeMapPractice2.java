package com.collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapPractice2 {

	public static void main(String[] args) {

		TreeMap t =new TreeMap(new MyComparator3());
		t.put("XXX", 10);
		t.put("AAA", 10);
		t.put("YYY", 10);
		t.put("SSS", 10);
		System.out.println(t);
	}

}
class MyComparator3 implements Comparator{
	
	public int compare(Object obj1, Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
	
}