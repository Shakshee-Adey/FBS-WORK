//Create a class with attributes and print data and also getters.
class MyData
{
  String FirstName;
  String LastName;
  int age;
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
  
}
class TestGet
{
  public static void main(String[] args)
{
  MyData m1;
  m1= new MyData();
  System.out.println(m1.getFirstName()); 
  System.out.println(m1.getLastName());
  System.out.println(m1.getAge());
}
}