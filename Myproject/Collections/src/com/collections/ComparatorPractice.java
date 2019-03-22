package com.collections;
import java.util.Comparator;
import java.util.TreeSet;

class myComparator implements Comparator
{
	//Logic for descending order

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		/*
		 * if(i1<i2) return 1; else if(i1>i2) return -1; else return 0;
		 */
		//return i1.compareTo(i2);// ascending order
		//return -i1.compareTo(i2);  //Descending order
		//return i2.compareTo(i1);
		//return -i2.compareTo(i1); //Ascending order
		//return 1; //Insertion order is conserved and duplicate is added
		//return -1; //reverse of insertion order
		return 0; //Only first element will be added
	}
	
}

public class ComparatorPractice {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new myComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

}