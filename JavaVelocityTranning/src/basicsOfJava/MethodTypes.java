package basicsOfJava;

public class MethodTypes 
{
	
	public static void main(String[] args) 
	{
		
		int c= method();
		c++;
		System.out.println(c);
		
	}

	
	
	public static int method() 
	{
		int a = 1;
		System.out.println(a);
		int b = 2;
		System.out.println(b);	
		
	    int c=a+b;
	    System.out.println(c);
	    return c;
	}
	
}
