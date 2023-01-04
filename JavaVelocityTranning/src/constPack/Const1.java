package constPack;

public class Const1
{

	public Const1()
	{
		int a = 100;
	System.out.println(a);
	System.out.println("Hii this is constructer program");
	}
	
	public void method1()
	{
		System.out.println("Hii this is non static method");
	}
	
	public static void main(String[] args) 
	{
	Const1 rahul= new Const1();
	
	rahul.method1();
	}
}
