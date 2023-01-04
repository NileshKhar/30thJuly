package oopsConcept;

public interface InterfaceRahul 
{
 
	public abstract void method1();
	public abstract void method2();
	
	//no need to write public and abstract
	
	void method3();
	 
	//complete methods not possible
//	public void method()
//	{
//		System.out.println("Interface rahul");
//	}
	
	public static void main(String[] args) 
	{
	
		//consider-method1-method2 ststic
//		method1();  //not possible
//		method2();  //not possible
		
		InterfaceRahul x=new InterfaceRahul();
		x.method1();
		x.method2();
		
		
		
		
		
	}
	
	
	
}
