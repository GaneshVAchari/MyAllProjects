package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapPractice {

	public static void main(String[] args) {
		//in Linked hashmap Insertion order preserved
		HashMap m= new LinkedHashMap();
		m.put("Ganesh",100);
		m.put("Umesh",200);
		m.put("Satish",300);
		m.put("Venkatesh",400);
		System.out.println(m);
		System.out.println(m.put("Ganesh",600)); //prints 100
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(s1); //[k=v, k=v...]
		Iterator itr=s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1=(Map.Entry)itr.next();   //Entry interface is inner interface of Map interface
			System.out.println(m1.getKey()+"----"+m1.getValue());
			if(m1.getKey().equals("Venkatesh"))
			{
				m1.setValue(1000);
			}
		}
		System.out.println(m);
	}

}
