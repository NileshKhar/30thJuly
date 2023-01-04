package casting;

public class ImpChildCLass implements Intface1
{

	@Override
	public void method1() 
	{
		System.out.println("Interface method 1");
	}

	@Override
	public void method2() 
	{
		System.out.println("Interface method 2");
	}
	
	public void method3() 
	{
		System.out.println("Child method 3");
	}
	
	public void method4() 
	{
		System.out.println("Child method 4");
	}

	public static void main(String[] args) 
	{
	
		ImpChildCLass x=new ImpChildCLass();
		x.method1();
		x.method2();
		x.method3();
		x.method4();
		
		Intface1 z=new ImpChildCLass();
		z.method1();
		z.method2();
		
		
	}
	
	
	
}
