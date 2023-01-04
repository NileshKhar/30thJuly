package constPack;

public class Allconcepts2 
{
	String name;
	int rollNo;
	char bGroup;
	int mobile;
	String emailId;
	String batch;

	public Allconcepts2()
	{
		name = "Rahul";
		rollNo = 122;
		bGroup='B';
		mobile=123456;
		emailId="rahul@gmail.com";
		batch = "30JultEve";
		
		System.out.println("Name is -> " + name
				+"Rollno is-> "+ rollNo 
				+ "bGroup is->"+ bGroup
				+ "Mobile NO is-> "+ mobile
				+ "Emailid is->"+ emailId
				+ "Batch name is->"+ batch);
	}
	
	public Allconcepts2(int x)
	{
		name = "Sumit";
		rollNo = 126;
		bGroup='A';
		mobile=143456;
		emailId="sumit@gmail.com";
		batch = "30JultEve";
		
		System.out.println("Name is -> " + name
				+"Rollno is-> "+ rollNo 
				+ "bGroup is->"+ bGroup
				+ "Mobile NO is-> "+ mobile
				+ "Emailid is->"+ emailId
				+ "Batch name is->"+ batch);
	}
	
	public Allconcepts2(char y)
	{
		name = "Akshay";
		rollNo = 127;
		bGroup='A';
		mobile=140956;
		emailId="Akshay@gmail.com";
		batch = "30JultEve";
		
		System.out.println("Name is -> " + name
				+"Rollno is-> "+ rollNo 
				+ "bGroup is->"+ bGroup
				+ "Mobile NO is-> "+ mobile
				+ "Emailid is->"+ emailId
				+ "Batch name is->"+ batch);
	}

	public static void main(String[] args) 
	{
		//RAhul
		Allconcepts2 a = new Allconcepts2();
		
		//Sumit
		Allconcepts2 b = new Allconcepts2(2);
		
		//Akshay
		Allconcepts2 c = new Allconcepts2('A');
		
	}
	
	
}
