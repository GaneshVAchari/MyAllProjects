package com.collections;

import java.util.HashMap;

public class WeakHashMap {

	public static void main(String[] args) throws InterruptedException {

		//In hash map garbage collector cannot delete hashmap associated object..Thats why hashmap is stronger than garbage collector
		/*HashMap m=new HashMap();
		Temp t=new Temp();
		m.put(t, "Ganesh");
		System.out.println(m);  // {temp=Ganesh}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);  {temp=Ganesh} */
		
		//In weakhashmap garbage collector dominates weakhashmap
		/*WeakHashMap m=new WeakHashMap();
		Temp t=new Temp();
		m.put(t,"Ganesh");
		System.out.println(m); {temp=Ganesh}
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);   {}*/
	}

}
class Temp
{
	public String toString()
	{
		return "temp";
	}
}
