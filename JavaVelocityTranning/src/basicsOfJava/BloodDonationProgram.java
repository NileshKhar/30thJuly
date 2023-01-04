package basicsOfJava;

public class BloodDonationProgram 
{
public static void main(String[] args) 
{
	int age = 20;
	int weight = 50;
	
	if(age>=18)
	{
		if (weight>=50)
		{
			System.out.println("Can donate Blood");
		}
		else
		{
			System.out.println("Check weight");
		}
			
	}
	else 
	{
		System.out.println(" Check age");
	}
	
}
}
