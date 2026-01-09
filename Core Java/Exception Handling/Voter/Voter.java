package p4;

public class Voter {
     
	int age ;
	Voter(int age)  //only parameterized constructor
	{
		this.age=age;
	}
	 void validate()  {
		if(this.age<18) 
		{
			try {
			throw new InvaildAgeException();
			}
			catch(InvaildAgeException iae)
			{
				System.out.println(iae);
			}
		}
		else
		{
			System.out.println("You can vote");
		}
	}
	
}
