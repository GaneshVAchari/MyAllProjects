package com.collections;

import java.util.TreeSet;

public class TreesetPractice2 {

	public static void main(String[] args) {
        //ClasscastException will come even if you are trying to add homogeneous element
		//Only we can add if its homogeneous and comparable
		//In String and wrapper classes objects are already implements comparable but in StringBuffer comparable is not applicable
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		t.add(new StringBuffer("B"));
		System.out.println(t);
		
	}

}
