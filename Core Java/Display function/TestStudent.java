class Student
{
    int id;
    String name;
    int marks;
                                            //setter
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
                                          // Display function
    void display() {
        System.out.println("Student Id : " + this.id);
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Marks : " + this.marks);
    }
}                                        // Student class end here
class TestStudent
{
  public static void main(String[] args)
  {
   Student s1,s2;
   s1 = new Student();
   s2 = new Student();

   s1.SetId(108);
   s1.SetName("Shakshee");
   s1.SetMarks(89);
   
   s2.SetId(109);
   s2.SetName("vani");
   s2.SetMarks(90);
   
   s1.display();
   s2.display();
   
   }// main ends here
}// TestStudent class end here

