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

} // Hr class end here
class TestHr
{
  public static void main(String[] args)
  {
   Hr h1,h2;
   h1 = new Hr();
   h1.SetHid(110);
   h1.SetHname("Shakshee");
   h1.SetSalary(90000);
   h1.SetCommission(200);
   System.out.printf(h1.hid +"/"+ h1.hname +"/"+ h1.salary +"/"+ h1.commission); 

   h2 = new Hr();
   h2.SetHid(112);
   h2.SetHname("Prachi");
   h2.SetSalary(60000);
   h2.SetCommission(500);
   System.out.printf(h2.hid +"/"+ h2.hname +"/"+ h2.salary +"/"+ h2.commission); 

   if(h1.getCommission() > h2.getCommission()) {
            System.out.println("h1 highest Commission");
        } else if (h1.getCommission() < h2.getCommission()) {
            System.out.println("h2 highest Commission");
        } 
    
   }// main ends here
}// TestHr class end here

