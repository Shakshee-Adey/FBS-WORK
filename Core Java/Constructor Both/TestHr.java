class Hr
{
    int hid;
    String hname;
    double salary;
    double commission;

    Hr()                                 //default constractor
    {
    System.out.println("constructor called");
    this.hid=111;
    this.hname="Monish";
    this.salary=36000;
    this.commission=3000;
    }

    Hr(int i,String h,double s, double c)   //parameterized constructor
    {
    this.hid=i;
    this.hname=h;
    this.salary=s;
    this.commission=c;
     }
    
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

                     // Getter 
    int getHid() {
        return this.hid;
    }

    String getHname() {
        return this.hname;
    }

    double getSalary() {
        return this.salary;
    }

    double getCommission() {
        return this.commission;
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
   h1.display();
   h2 = new Hr(112,"Manish",40000,1000);
   h2.display();
    
   }// main ends here
}// TestHr class end here

