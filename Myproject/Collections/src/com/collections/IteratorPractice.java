package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		for (int i=0;i<=10;i++)
		{
			al.add(i);
		}
		Iterator itr=al.iterator();
		System.out.println("Iterator Class name" +itr.getClass().getName());
		while(itr.hasNext())
		{
			Integer it= (Integer) itr.next();
			if(it%2==0)
			{
				System.out.println(it);
			}
			
		}
	
	}

}
