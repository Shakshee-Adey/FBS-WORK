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
   h1.SetHid(108);
   h1.SetHname("Shakshee");
   h1.SetSalary(2900);
   h1.SetCommission(269);
   h1.display();
   
    
   }// main ends here
}// TestHr class end here

