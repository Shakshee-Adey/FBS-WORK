class Date
{
    int day,month,year;
    String dow;

                                        // Setter 
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
    void SetDow(String s)
    {
     this.dow=s;
    }
    
    void display()                     //display function
    {
     System.out.println("Day is :"+ this.day);
     System.out.println("Month is :"+ this.month);
     System.out.println("Year is :"+ this.year);
     System.out.println("Dow is :"+ this.dow);
    }
    
    
} // Date class end here
class TestDate
{
  public static void main(String[] args)
  {
   Date d1,d2;
   d1 = new Date();
   d2 = new Date();
   
   d1.SetDay(12);
   d1.SetMonth(12);
   d1.SetYear(2025);
   d1.SetDow("sunday");
   
   d2.SetDay(11);
   d2.SetMonth(10);
   d2.SetYear(2024);
   d2.SetDow("munday");
   d1.display();
   d2.display();
    
   }// main ends here
}// TestDate class end here