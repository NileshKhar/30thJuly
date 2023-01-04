package packAB;

public class classA 
{

public classA() 
{
	System.out.println("Class A const ");
	
}
	 public static int a =100;
		
		public int b = 200;
		
		public static void method1()
		{
			System.out.println("Method1 displayed");
		}
		
		public void method2()
		{
			System.out.println("method2 displayed");
		}
		
		public static void main(String[] args) 
		{
		System.out.println(a);
		
		method1();
		
			
		classA x = new classA();
		x.method2();
		
		System.out.println(x.b);
		
		}
		
	
	
}
