//Create a class with attributes and print data.
class MyData
{
  String FirstName;
  String LastName;
  int age;
   // setters method
  void setFirstName(String FirstName)
   {
    this.FirstName=FirstName;
   }
   void setLastName(String LastName)
  {
   this.LastName=LastName;
  }
  void setAge(int age)
  {
   this.age=age;
  }
  
}
class TestSet
{
  public static void main(String[] args)
{
  MyData m1;
  m1= new MyData();
  
  m1.setFirstName("Shakshee");
  m1.setLastName("Adey");
  m1.setAge(22);

  System.out.println("My Name is " + m1.FirstName + " " + m1.LastName + "\nmy age is " + m1.age);
}
}