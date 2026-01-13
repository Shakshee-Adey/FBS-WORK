package p4;

public class TestGrade {
     
	public static void main(String args[])
	{
	Result r1 = new Result("Shakshee",108,1123);
	try 
	{
		r1.validGrade();
	}
	catch(InvalidMarksException ime)
	{
		System.out.println(ime);
	}
 }
}