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
    
} // SalesManager class end here
class TestSalesManager
{
  public static void main(String[] args)
  {
   SalesManager s1,s2;
   s1 = new SalesManager();
   s1.SetSid(110);
   s1.SetSname("Shakshee");
   s1.SetSalary(90000);
   s1.SetIncentive(200);
   s1.SetTarget(5);
   System.out.printf(s1.sid +"/"+ s1.sname +"/"+ s1.salary +"/"+ s1.incentive +"/"+ s1.target); 

   s2 = new SalesManager();
   s2.SetSid(112);
   s2.SetSname("Prachi");
   s2.SetSalary(60000);
   s2.SetIncentive(500);
   s2.SetTarget(3);
   System.out.printf(s2.sid +"/"+ s2.sname +"/"+ s2.salary +"/"+ s2.incentive +"/"+ s2.target); 

   if(s1.getIncentive() > s2.getIncentive()) {
            System.out.println("s1 highest Incentive");
        } else if (s1.getIncentive() < s2.getIncentive()) {
            System.out.println("s2 highest Incentive");
        } 
   }// main ends here
}// TestSalesManager class end here

