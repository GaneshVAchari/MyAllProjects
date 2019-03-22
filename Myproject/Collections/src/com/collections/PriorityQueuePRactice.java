package com.collections;

import java.util.PriorityQueue;

public class PriorityQueuePRactice {
	public static void main(String args[])
	{
	PriorityQueue q=new PriorityQueue();
//	System.out.println(q.peek()); //null
//	System.out.println(q.element()); //RE:NSEE
	for(int i=0;i<10;i++)
	{
		q.offer(i);
	}
	System.out.println(q);
	System.out.println(q.poll());
	System.out.println(q); // some operating systems wont provide proper support for thread priority..Thats y its giving not sorted value
	}
}
