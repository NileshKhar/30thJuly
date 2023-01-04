package oopsConcept;

public class ChildClass extends ParentClass
{
	public ChildClass()
	{
		System.out.println("ChildClass Const");
	}
	
	public static void main(String[] args) 
	{
	
		ChildClass x = new ChildClass();
		System.out.println(x.b);
		
	}
	
	
}
