class Employee
{
    int id;
    String name;
    double salary;
    void SetId(int i)
    {
     this.id=i;
    }
    void SetName(String n)
    {
    this.name=n;
    }
    void SetSalary(double s)
    {
    this.salary=s;
    }
} // Employee class end here
class TestEmployee
{
  public static void main(String[] args)
  {
   Employee e;
   e = new Employee();
   e.SetId(101);
   e.SetName("Prachi");
   e.SetSalary(29000);
   System.out.printf("Employee is :"+ e.id +"/"+ e.name +"/"+ e.salary); 
   }// main ends here
}// TestEmployee class end here

