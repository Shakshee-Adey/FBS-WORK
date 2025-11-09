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

    
                                        // Display function
    void display() {
        System.out.println("Admin Id : " + this.id);
        System.out.println("Admin Name : " + this.name);
        System.out.println("Admin salary : " + this.salary);
        System.out.println("Admin Allowance : " + this.allowance);
}
} // Admin class end here
class TestAdmin
{
  public static void main(String[] args)
  {
   Admin a1;
   a1 = new Admin();
   a1.SetId(120);
   a1.SetName("shakshee");
   a1.SetSalary(2000);
   a1.SetAllowance(230);
   a1.display();
   
    
   }// main ends here
}// TestAdmin class end here

