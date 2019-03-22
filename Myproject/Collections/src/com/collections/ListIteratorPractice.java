package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorPractice {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add("Ganesh");
		l.add("Achari");
		l.add("Satish");
		l.add("Achari");
		System.out.println(l);
		ListIterator lir=l.listIterator();
		System.out.println("ListIterator Class name" +lir.getClass().getName());
		while(lir.hasNext())
		{
			String s=(String) lir.next();
			if(s.equals("Achari"))
			{
				lir.remove();
			}
			else if(s.equals("Satish"))
			{
				lir.add("Umesh");
			}
			else if(s.equals("Ganesh"))
			{
				lir.set("Vijaya");
			}
		}
		System.out.println(l);
		
	}

}
