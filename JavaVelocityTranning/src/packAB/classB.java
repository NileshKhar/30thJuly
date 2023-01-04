package packAB;

public class classB 
{

	public static void main(String[] args) 
	{
	//static lee call
//		System.out.println(a);  //not possible
		
		System.out.println(classA.a);
		
		//ststic method
		classA.method1();
		
		//non static mathods
		
		classA x = new classA();
		
		System.out.println(x.b);
		
		x.method2();
		
	}
	
	
	
	
}
