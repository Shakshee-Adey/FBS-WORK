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

                                    // Getter 
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }
    double getSalary()
    {
      return this.salary;
    }
    double getAllowance()
    {
      return this.allowance;
    }
} // Admin class end here
class TestAdmin
{
  public static void main(String[] args)
  {
   Admin a1,a2;
   a1 = new Admin();
   a1.SetId(1109);
   a1.SetName("Shakshee");
   a1.SetSalary(9000);
   a1.SetAllowance(200);
   System.out.printf(a1.id +"/"+ a1.name +"/"+ a1.salary +"/"+ a1.allowance); 

   a2 = new Admin();
   a2.SetId(1119);
   a2.SetName("Shakshu");
   a2.SetSalary(5000);
   a2.SetAllowance(500);
   System.out.printf(a2.id +"/"+ a2.name +"/"+ a2.salary +"/"+ a2.allowance); 

    
   }// main ends here
}// TestAdmin class end here

