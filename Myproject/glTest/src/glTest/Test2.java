package glTest;

class Test2 {
	int i=10;
	final void getValue()
	{
		System.out.println(i);
	}
}

class B extends Test2{
	
}

class C extends B
{
	public static void main(String args[])
	{
		Test2 t=new Test2();
		t.getValue();
	}
}