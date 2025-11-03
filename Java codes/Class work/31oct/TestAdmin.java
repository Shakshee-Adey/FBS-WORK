class Admin
{
    int id;
    String name;
    double salary;
    double allowance;
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
    void SetAllowance(double a)
    {
    this.allowance=a;
    }
} // Admin class end here
class TestAdmin
{
  public static void main(String[] args)
  {
   Admin h;
   h = new Admin();
   h.SetId(111);
   h.SetName("Shakshee");
   h.SetSalary(59000);
   h.SetAllowance(500);
   System.out.printf(h.id +"/"+ h.name +"/"+ h.salary+"/"+ h.allowance); 
   }// main ends here
}// TestAdmin class end here

