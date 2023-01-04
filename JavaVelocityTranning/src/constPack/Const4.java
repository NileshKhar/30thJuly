package constPack;

public class Const4 
{
	
	public Const4()
	{
		System.out.println("Cont without args");
	}
	
	public Const4(int a)
	{
		System.out.println("Cont with args");
	}
	
	public void method1()
	{
		System.out.println("This is method1");
	}
	
	public static void main(String[] args) 
	{
		Const4 y = new Const4();
		y.method1();
		
		Const4 z = new Const4();
		z.method1();
	}
}
