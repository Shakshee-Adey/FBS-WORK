class Student
{
    int id;
    String name;
    int marks;
    void SetId(int i)
    {
     this.id=i;
    }
    void SetName(String n)
    {
    this.name=n;
    }
    void SetMarks(int m)
    {
    this.marks=m;
    }
    
} // Student class end here
class TestStudent
{
  public static void main(String[] args)
  {
   Student s;
   s = new Student();
   s.SetId(110);
   s.SetName("Shakshee");
   s.SetMarks(90);
   System.out.printf(s.id +"/"+ s.name +"/"+ s.marks); 
   }// main ends here
}// TestStudent class end here
