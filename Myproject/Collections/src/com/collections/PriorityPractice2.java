package com.collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityPractice2 {

	public static void main(String[] args) {

		//Program for customized priority
		PriorityQueue q=new PriorityQueue(15,new MyComparator4());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println(q);
		
	}

}
class MyComparator4 implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String s1=(String) obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}