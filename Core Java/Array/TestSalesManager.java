class SalesManager
{
    int sid;
    String sname;
    double salary;
    double incentive;
    int target; 

    SalesManager()                                         //default constractor
    {
    System.out.println("constructor called");
    this.sid=202;
    this.sname="Vidhya";
    this.salary=31000;
    this.incentive=500;
    this.target=4;
    }

    SalesManager(int i,String a,double q, double c, int t)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.sid=i;
    this.sname=a;
    this.salary=q;
    this.incentive=c;
    this.target=t;
     }
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
   SalesManager arr[]=new SalesManager[3];
   arr[0]=new SalesManager();
   arr[1]=new SalesManager(114,"shakshee",56000,5000,6);
   arr[2]=new SalesManager(115,"prachi",96000,5000,5);
   int i;
   for(i=0; i<arr.length; i++)
   {
     arr[i].display();
    }
   }// main ends here
}// TestSalesManager class end here

