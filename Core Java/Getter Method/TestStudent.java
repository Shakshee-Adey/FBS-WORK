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
    
}                                        // Student class end here
class TestStudent
{
  public static void main(String[] args)
  {
   Student s1,s2;
   s1 = new Student();
   s1.SetId(110);
   s1.SetName("Shakshee");
   s1.SetMarks(90);
   System.out.printf(s1.id +"/"+ s1.name +"/"+ s1.marks); 

   s2 = new Student();
   s2.SetId(112);
   s2.SetName("Prachi");
   s2.SetMarks(80);
   System.out.printf(s2.id +"/"+ s2.name +"/"+ s2.marks);

   if(s1.getMarks() > s2.getMarks()) {
            System.out.println("s1 highest marks");
        } else if (s1.getMarks() < s2.getMarks()) {
            System.out.println("s2 highest marks");
        } 
   }// main ends here
}// TestStudent class end here

