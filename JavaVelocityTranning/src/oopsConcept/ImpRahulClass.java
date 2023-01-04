package oopsConcept;

public class ImpRahulClass implements InterfaceRahul  
{

	@Override
	public void method1()
	{

System.out.println("method1 form implementation class");
	}

	@Override
	public void method2() 
	{

		System.out.println("method2 form implementation class");
	}

	public static void main(String[] args) 
	{
	
		ImpRahulClass x=new ImpRahulClass();
		x.method1();
		x.method2();
		
		
		
		
	}
	
}
