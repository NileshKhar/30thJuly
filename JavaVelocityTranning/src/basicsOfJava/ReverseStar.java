package basicsOfJava;

public class ReverseStar
{
	
	public static void main(String[] args)
	{
		
		
//		Ex. 01
//		for(int i=1; i<=5 ; i++)                  //Row
//		{
//			
//			for(int j=4; j>=i ; j--)
//			{
//				System.out.print(" ");    //A
//			}
//			for(int h=1; h<=i ; h++)
//			{
//				System.out.print("*");    //P
//			}
//		    
//			System.out.println();  
//		}
//		
//		for(int i=5; i>=1 ; i--)                  //Row
//		{
//			
//			for(int j=4; j>=i ; j--)
//			{
//				System.out.print(" ");    //A
//			}
//			for(int h=1; h<=i ; h++)
//			{
//				System.out.print("*");    //P
//			}
//		    
//			System.out.println();  
//		}
//		
		
		for(int i=1; i<=5 ; i++)                  //Row
			{
				
				for(int j=4; j>=i ; j--)
				{
					System.out.print(" ");    //A
				}
				for(int h=1; h<=i ; h++)
				{
					System.out.print("*");    //P
				}
			    
				System.out.println();  
			}
			for(int i=4; i>=1 ; i--)                  //Row
			{
				
				for(int j=4; j>=i ; j--)
				{
					System.out.print(" ");    //A
				}
				for(int h=1; h<=i ; h++)
				{
					System.out.print("*");    //P
				}
			    
				System.out.println();  
			}
		
		
		
		
		
		
		
	}

}
