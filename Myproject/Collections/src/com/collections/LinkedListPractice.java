package com.collections;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add("ganesh");
		l.add(30);
		l.add(null);
		l.add("achari");
		System.out.println(l);
		l.set(0, "Satish");
		l.add(1, "ach");
		System.out.println(l);
		l.removeLast();
		l.addFirst("Mr");
		System.out.println(l);
	}

}
