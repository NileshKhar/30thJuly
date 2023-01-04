package constPack;

public class Const2
{
	int a;
	//Use defined const
//	public Const2()
//	{
//		a= 100;
//		System.out.println(a);
//		System.out.println("Hi this is const present here");	
//	}
	
	public void method1()
	{
		System.out.println("Hi this is non static method");
		
	}
	
	public static void main(String[] args) 
	{
		Const2 z = new Const2();
		z.method1();
		
	}
}
