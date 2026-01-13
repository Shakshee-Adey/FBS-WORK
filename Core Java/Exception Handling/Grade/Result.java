package p4;

public class Result {
     
	String name;
	int rollNo;
	int marks;
	
	Result(String name,int rollNo,int marks)
	{
	 this.name=name;
	 this.rollNo=rollNo;
	 this.marks=marks;
	}
	void validGrade() throws InvalidMarksException
	{
		if(marks<0||marks >100)
		{
			throw new InvalidMarksException();
		}
		else if (marks >= 35 && marks <= 50) {
            System.out.println("Pass");
        } 
        else if (marks >= 51 && marks <= 59) {
            System.out.println("Second Class");
        } 
        else if (marks >= 60 && marks <= 74) {
            System.out.println("First Class");
        } 
        else if (marks >= 75) {
            System.out.println("Distinction");
        }
        else {
        	System.out.println("Fail");
        }
    }
}
