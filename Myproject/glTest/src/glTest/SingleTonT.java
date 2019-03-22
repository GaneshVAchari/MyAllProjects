package glTest;

public class SingleTonT {

	public static void main(String[] args) {

		 
		 SingletonTest s1=SingletonTest.getInstance(); System.out.println(s1);
		 SingletonTest s2=SingletonTest.getInstance(); System.out.println(s2);
		 
		 s1.str=(s1.str).toUpperCase();
		 System.out.println(s1.str);
		 
		 s2.str=(s2.str).toUpperCase();
		 System.out.println(s2.str);
		 
		
		/*
		 * sing st=sing.getInstance(); System.out.println(st); sing
		 * st1=sing.getInstance(); System.out.println(st1);
		 */
	}

}
