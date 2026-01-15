package Assignment;

public class TestAdmission {
        
	public static void main(String args[])
	{
		AdmissionForm a1= new AdmissionForm("shakshee ",19,86.6,70000,50000);
		try 
		{
            a1.validateForm();
            System.out.println("Admission Successfull!");
        } 
		catch (EmptyNameException e) 
		{
            System.out.println(e);
        } 
		catch (UnderAgeException u) 
		{
            System.out.println(u);
        } 
		catch (InvalidPercentageException i) 
		{
            System.out.println(i);
        } 
		catch (NotFeetForAdmissionException n) 
		{
            System.out.println(n);
        } 
		catch (FeesNotPaidException f)
		{
            System.out.println(f);
        }
		catch (InsufficientFeesException i)
		{
            System.out.println(i);
        }
	}
}
