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
   Student arr[]=new Student[3];
   arr[0]=new Student();
   arr[1]=new Student(114,"shakshee",56);
   arr[2]=new Student(115,"prachi",96);
   int i;
   for(i=0; i<arr.length; i++)
   {
     arr[i].display();
    }
   }// main ends here
}// TestStudent class end here