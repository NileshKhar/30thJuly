package polymorphism;

public class MethodOverloading
{
	//Write multiple method but with diff args
	
	public void method1()
	{
		System.out.println("Method1");
		
	}

	public void method1(int a)
	{
		System.out.println("Method1 with int args");
		
	}
	
	public void method1(char a)
	{
		System.out.println("Method1 with char a args");
		
	}
	
	public void method1(char a,char b)
	{
		System.out.println("Method1 with char a,char b args");
		
	}
	
	public void method1(String a,char b)
	{
		System.out.println("Method1 with String a,char b args");
		
	}
	public static void main(String[] args) 
	{
		MethodOverloading x=new MethodOverloading();
	    x.method1();
		x.method1(0);
		x.method1('A');
		x.method1('A','B');
		x.method1("ABC", '0');
	}
	
	
	
	
}
