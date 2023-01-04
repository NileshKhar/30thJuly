package oopsConcept;

public class childCls extends parentcls
{
	
	public void method3()
	{
		System.out.println("Method3 Child cls");
	}

	public void method4()
	{
		System.out.println("Method4 Child cls");
	}
	
//	public void method1()
//	{
//		System.out.println("Upcasting Method1 child cls");
//	}
	
	public static void main(String[] args) 
	{
	
		childCls x= new childCls();
		x.method1();
		x.method2();
		x.method3();
		x.method4();
		
		//Upcasting 
		parentcls y=new childCls();
		y.method1();
		y.method2();
		
//		y.method3(); //notpossible
		
	}
	
	
}
