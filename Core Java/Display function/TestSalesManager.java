class SalesManager
{
    int sid;
    String sname;
    double salary;
    double incentive;
    int target;
                            //setter
    void SetSid(int s)
    {
     this.sid=s;
    }
    void SetSname(String n)
    {
    this.sname=n;
    }
    void SetSalary(double d)
    {
    this.salary=d;
    }
    void SetIncentive(double v)
    {
    this.incentive=v;
    }
    void SetTarget(int g)
    {
    this.target=g;
    }
    

                                         // Display function
    void display() {
        System.out.println("salesManager ID : " + this.sid);
        System.out.println("salesManager Name : " + this.sname);
        System.out.println("Salary : " + this.salary);
        System.out.println("Incentive : " + this.incentive);
        System.out.println("Target : " + this.target);
    }
} // SalesManager class end here
class TestSalesManager
{
  public static void main(String[] args)
  {
   SalesManager s1,s2;
   s1 = new SalesManager();
   
   s2 = new SalesManager();
   

   s1.SetSid(102);
   s1.SetSname("shakshee");
   s1.SetSalary(8900);
   s1.SetIncentive(230);
   s1.SetTarget(3);
   s1.display();

   s2.SetSid(111);
   s2.SetSname("vani");
   s2.SetSalary(3900);
   s2.SetIncentive(200);
   s2.SetTarget(5);
   s2.display();

   
   }// main ends here
}// TestSalesManager class end here
