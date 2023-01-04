package stringPack;

public class Sring1 
{
public static void main(String[] args) 
{
//	String a= " Rahul ";
//	String b= " Apple ";
//	
//	System.out.println(a);
//	
//	String c=a.concat(b);
//	
//	System.out.println(c);
//	
//	System.out.println(a==c);
//	System.out.println(b==c);
//	
//	String d= a.replace( ' ', 's');
//	
	
	String a="Nilesh";
	
	String rev="";
	
//	String Rev="";
	
	char x;
	
	for(int i=0; i<a.length();i++)
	{
		x=a.charAt(i);
		rev= x+ rev;
		
	}
	
	System.out.println("Reverse of Nilesh is "+ rev);
	
	

	
}
	
	
	
	
}
