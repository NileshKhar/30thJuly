package oopsConcept;

public class ImpSumitClass implements InterfaceSumit
{

	@Override
	public void method1() {
		
		System.out.println("Hello");
		
	}

	@Override
	public void method2() {
		System.out.println("Bye");
		
	}
	
	public static void main(String[] args) 
	{
	
		ImpSumitClass x=new ImpSumitClass();
		x.method1();
		x.method2();
		
		
	}
	
	

}
