package p4;

public class Test {
     
	public static void main(String args[]) {
		
		try {
		
			 int a=Integer.parseInt(args[0]);
			 int b=Integer.parseInt(args[1]);
			 
			 int c=a/b;
			 System.out.println("Result :- "+c);
			 
			// System.out.println("Some important code");
		}//try ends here
		
		catch (NumberFormatException nfe) {
            System.out.println("enter valid integers");
        }
		catch (ArithmeticException ae) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException aibe) {
            System.out.println("pass atleast two command-line arguments");
        }
		catch (Exception e)
		{
			System.out.println("oops somrthing went wrong");
		}
		finally
		{
			System.out.println("Some important code");
		}
	}
}
