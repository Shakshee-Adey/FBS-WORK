class Hr
{
    int id;
    String name;
    double salary;
    double commission;
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
    void SetCommission(double c)
    {
    this.commission=c;
    }
} // Hr class end here
class TestHr
{
  public static void main(String[] args)
  {
   Hr h;
   h = new Hr();
   h.SetId(111);
   h.SetName("Shakshee");
   h.SetSalary(59000);
   h.SetCommission(2000);
   System.out.printf(h.id +"/"+ h.name +"/"+ h.salary+"/"+ h.commission); 
   }// main ends here
}// TestHr class end here
