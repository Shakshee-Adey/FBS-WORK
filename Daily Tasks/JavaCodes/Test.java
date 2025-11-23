//Create a class with attributes and print data.
class MyData
{
  String FirstName;
  String LastName;
  int age;
}
class Test
{
  public static void main(String[] args)
{
  MyData m1;
  m1= new MyData();
  
  m1.FirstName = "Shakshee";
  m1.LastName = "Adey";
  m1.age = 22;

  System.out.println("My Name is " + m1.FirstName + " " + m1.LastName + "\nmy age is " + m1.age);
}
}