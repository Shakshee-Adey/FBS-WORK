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
     
                                           // Getter 
    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    int getMarks(){
        return this.marks;
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
        s1.SetMarks(78);

        s2.SetId(109);
        s2.SetName("vani");
        s2.SetMarks(56);

                                             // Display both students
        s1.display();
        s2.display();

                                              // Compare marks
        if (s1.getMarks() > s2.getMarks()) {
            System.out.println("s1 highest marks");
        } else if (s1.getMarks() < s2.getMarks()) {
            System.out.println("s2 highest marks");
        }
   }// main ends here
}// TestStudent class end here

