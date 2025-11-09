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

                         // Getter 
    int getSid() {
        return this.sid;
    }

    String getSname() {
        return this.sname;
    }
    double getSalary()
    {
      return this.salary;
    }

    double getIncentive() {
        return this.incentive;
    }

    double getTarget() {
        return this.target;
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
   SalesManager s1;
   s1 = new SalesManager();
   
   s1.SetSid(108);
   s1.SetSname("Shakshee");
   s1.SetSalary(7800);
   s1.SetIncentive(1090);
   s1.SetTarget(4);
   s1.display();
   }// main ends here
}// TestSalesManager class end here

