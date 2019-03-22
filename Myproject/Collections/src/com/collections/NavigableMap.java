package com.collections;

import java.util.TreeMap;

public class NavigableMap {

	public static void main(String[] args) {

		TreeMap<String, String> t=new TreeMap<String, String>();
		t.put("b","banana");
		t.put("c","cat");
		t.put("d","dog");
		t.put("e","elephant");
		t.put("m","monkey");
		t.put("g","gun");
		System.out.println(t);
		System.out.println(t.ceilingKey("c"));
		System.out.println(t.higherKey("e"));
		System.out.println(t.floorKey("e"));
		System.out.println(t.lowerKey("e"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
	}

}
