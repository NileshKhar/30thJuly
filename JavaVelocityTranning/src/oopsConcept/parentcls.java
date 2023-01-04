package oopsConcept;

public class parentcls 
{
	
	
	public void method1()
	{
		System.out.println("Method1 parent cls");
	}

	public void method2()
	{
		System.out.println("Method2 parent cls");
	}

	public static void main(String[] args) 
	{
	
		parentcls x= new parentcls();
		x.method1();
		x.method2();
	}
	
}
