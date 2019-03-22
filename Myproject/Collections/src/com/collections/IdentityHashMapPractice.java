package com.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapPractice {

	public static void main(String[] args) {

		
		/*HashMap m=new HashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1,"Ganesh");
		m.put(i2, "Achari");
		System.out.println(m);*/
		
		IdentityHashMap m=new IdentityHashMap();
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		m.put(i1,"Ganesh");
		m.put(i2, "Achari");
		System.out.println(m);
	}

}
