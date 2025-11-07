class SalesManager
{
    int id;
    String name;
    double salary;
    double incentive;
    int target;
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
    void SetIncentive(double i)
    {
    this.incentive=i;
    }
    void SetTarget(int t)
    {
    this.target=t;
    }
} // SalesManager class end here
class TestSalesManager
{
  public static void main(String[] args)
  {
   SalesManager h;
   h = new SalesManager();
   h.SetId(111);
   h.SetName("Shakshee");
   h.SetSalary(59000);
   h.SetIncentive(3000);
   h.SetTarget(3);
   System.out.printf(h.id +"/"+ h.name +"/"+ h.salary+"/"+ h.incentive+"/"+ h.target); 
   }// main ends here
}// TestSalesManager class end here
