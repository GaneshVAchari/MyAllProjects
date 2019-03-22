package com.collections;

import java.util.TreeMap;

public class TreeMapPractice1 {

	public static void main(String[] args) {

		TreeMap t= new TreeMap();
		t.put(100, "zzz");
		t.put(103, "yyy");
		t.put(101, "xxx");
		t.put(104, 106);
		//t.put(null, "aaa");
		//t.put(null, null);
		t.put("FFF", "XXX"); //CCE
		//t.put(null, "xxx");
		System.out.println(t);
	}

}
