package project;

class Student {
	int rollno;
	String name;
	
	
	public Student(int rollno, String name) {
		
		this.rollno = rollno;
		this.name = name;
	}

}
class Test
{
	public static void main(String args[])
	{
		Student[] s = {  new Student(1,"shaksi"),
				 new Student(2,"prachi"),
				 new Student(3,"bharti"),
				 new Student(4,"roshni"),
				 new Student(5,"prit")};
		
		int f=2;
		
		int start=0;
		int end=s.length-1;
		
		while(start <= end)
		{
			int mid=(start+end)/2;
			
			if(s[mid].rollno == f)
			{
				System.out.println("student found \n"  + s[mid].name);
				break;
			}
			
			else if(s[mid].rollno < f)
			{
				start=mid+1;
			}
			else
			{
				end = mid-1;
			}
			
			
		}
	}
}
