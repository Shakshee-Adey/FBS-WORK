package Assignment;

public class AdmissionForm {
       
	String name;
	int age;
	double percentage;
	double courseFees;
	double feesPaid;
	
	
	public AdmissionForm(String name,int age,double percentage,double courseFees,double feesPaid)
	{
		this.name=name;
		this.age=age;
		this.percentage=percentage;
		this.courseFees=courseFees;
		this.feesPaid=feesPaid;
	}
	public void validateForm() throws EmptyNameException,UnderAgeException,InvalidPercentageException,NotFeetForAdmissionException,FeesNotPaidException,InsufficientFeesException
	{
		if(name==null||name.trim().isEmpty())
		{
			throw new EmptyNameException();
		}
		else {
			System.out.println(this.name);
		}
		
		if(age<17)
		{
			throw new UnderAgeException();
		}
		else
		{
			System.out.println(this.age);
		}
		
		
		if(percentage<0 || percentage>100)
		{
			throw new InvalidPercentageException();
		}
		else
		{
			System.out.println(this.percentage);
		}
		
		
		if(percentage<35)
		{
			throw new NotFeetForAdmissionException();
		}
		else
		{
			System.out.println(this.percentage);
		}
		
		
		if(feesPaid==0)
		{
			throw new FeesNotPaidException();
		}
		else
		{
			System.out.println(this.feesPaid);
		}

		if(feesPaid<(0.30*courseFees))
		{
			throw new InsufficientFeesException();
		}
		else
		{
			System.out.println(this.feesPaid);
		}
	}
}
