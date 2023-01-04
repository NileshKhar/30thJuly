package Pack12;

public class Pack1 
{
protected static int a=100;
       public int b=200;
       
       public static void method1()
       {
    	   System.out.println("static method called");
    	   
       }
       
       public void method2()
       {
    	   System.out.println("non-static method called");
       }
       
       public static void main(String[] args) 
       {
		
    	   System.out.println(a);
    	   method1();
    	   
    	   Pack1 x =new Pack1();
    	   System.out.println(x.b);
    	   
    	  x.method2();
    	   
	}
       
}

