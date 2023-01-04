package constPack;

public class Const3
{

	int a;
	int b;
	
	
	//Const without args
	public Const3()
	{
		a=10;
		b=20;
	System.out.println(a);
	System.out.println(b);
	}
	
	//Const with args
	public Const3(String X)
	{
		a=100;
		b=200;
	System.out.println(a);
	System.out.println(b);
	}
	
	//Method1
	public void method1()
	{
		System.out.println("Hii this is non static method");
	}
	
	
	//Main
	public static void main(String[] args) 
	{
	Const3 rahul= new Const3();
	
//	rahul.method1();
	
	}
	
	
	
	
}
