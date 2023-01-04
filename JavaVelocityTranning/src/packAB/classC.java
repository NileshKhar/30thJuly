package packAB;

public class classC extends classA
{
	
	public classC()
	{
		System.out.println("Class C const");
	}
	
	
	
	public static void main(String[] args) 
	{
	
		classC x = new classC();
		System.out.println(x.b);
		
		
		classA.method1();
		System.out.println(classA.a);
	}

}
