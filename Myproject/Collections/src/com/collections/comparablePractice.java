package com.collections;

public class comparablePractice {

	public static void main(String[] args) {
		
		// if requirement is default natural sorting
		System.out.println("A".compareTo("A")); 
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("A".compareTo("a"));
		System.out.println("A".compareToIgnoreCase("a"));
		//System.out.println("A".compareTo(null));
		
	}

}
