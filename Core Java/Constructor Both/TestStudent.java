class Student
{
    int id;
    String name;
    int marks;

    Student()                                 //default constractor
    {
    System.out.println("constructor called");
    this.id=151;
    this.name="Bharti";
    this.marks=97;
    }

    Student(int i,String n,int m)           //parameterized constructor
    {
    System.out.println("constructor called");
    this.id=i;
    this.name=n;
    this.marks=m;
     }
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
   s1.display();
   s2 = new Student(129,"Tara",67);
   s2.display();
   }// main ends here
}// TestStudent class end here

