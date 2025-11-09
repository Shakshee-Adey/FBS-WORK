class Hr
{
    int hid;
    String hname;
    double salary;
    double commission;

    void SetHid(int i)                 //setter
    {
     this.hid=i;
    }
    void SetHname(String n)
    {
    this.hname=n;
    }
    void SetSalary(double s)
    {
    this.salary=s;
    }
    void SetCommission(double c)
    {
    this.commission=c;
    }

    // Display function
    void display() {
        System.out.println("Hr ID   : " + this.hid);
        System.out.println("Hr Name : " + this.hname);
        System.out.println("Hr Salary  : " + this.salary);
        System.out.println("Commission  : " + this.commission);
    }
} // Hr class end here
class TestHr
{
  public static void main(String[] args)
  {
   Hr h1,h2;
   h1 = new Hr();
   h2 = new Hr();
   
   h1.SetHid(102);
   h1.SetHname("shakshee");
   h1.SetSalary(10000);
   h1.SetCommission(1000);

   h2.SetHid(190);
   h2.SetHname("shakshu");
   h2.SetSalary(9000);
   h2.SetCommission(10);

   h1.display();
   h2.display();
    
   }// main ends here
}// TestHr class end here

