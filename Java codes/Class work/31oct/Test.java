class Date
{
    int day,month,year;
    String dow;
    void SetDay(int d)
    {
     this.day=d;
    }
    void SetMonth(int m)
    {
    this.month=m;
    }
    void SetYear(int y)
    {
    this.year=y;
    }
    void SetDow(String str)
    {
    this.dow=str;
    }
} // Date class end here
class Test
{
  public static void main(String[] args)
  {
   Date d1;
   d1 = new Date();
   d1.SetDay(01);
   d1.SetMonth(11);
   d1.SetYear(2025);
   d1.SetDow("sunday");
   System.out.printf("Date is :"+ d1.day +"/"+ d1.month +"/"+ d1.year); 
   System.out.printf("Day of week :" + d1.dow);
   }// main ends here
}// Test class end here

