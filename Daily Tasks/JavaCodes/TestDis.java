//Create a class with attributes and print data and also getters ,setters and constructor.
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

     // getters method

  String getFirstName()
   {
    return FirstName;
   }
   String getLastName()
  {
   return LastName;
  }
  int getAge()
  {
   return age;
  }
  
   void display()
{
  System.out.println("Firstname is " + this.FirstName);
  System.out.println("Lastname is " + this.LastName);
  System.out.println("Age is " + this.age); 
}
}
class TestDis
{
  public static void main(String[] args)
{
  MyData m1;
  m1= new MyData();
  m1.setFirstName("Shakshee");
  m1.setLastName("Adey");
  m1.setAge(22);
  m1.display();
}
}