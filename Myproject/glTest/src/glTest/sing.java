package glTest;

public class sing {
	static sing st;
	private sing()
	{
		
	}
    public static sing getInstance()
    {
    	if(st==null)
    	{
    		st=new sing();
    		return st;
    	}
    	  return st;
    }
}
