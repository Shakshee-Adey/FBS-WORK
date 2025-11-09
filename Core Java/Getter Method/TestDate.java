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

                                        //Getter
    int getDay() {
        return this.day;
    }

    int getMonth() {
        return this.month;
    }

    int getYear() {
        return this.year;
    }

    String getDow() {
        return this.dow;
    }
    
} // Date class end here
class TestDate
{
  public static void main(String[] args)
  {
   Date d1,d2;
   d1 = new Date();
   d1.SetDay(11);
   d1.SetMonth(9);
   d1.SetYear(2025);
   d1.SetDow("Sunday");
   System.out.printf(d1.day +"/"+ d1.month +"/"+ d1.year +"/"+ d1.dow); 

   d2 = new Date();
   d2.SetDay(11);
   d2.SetMonth(10);
   d2.SetYear(2025);
   d2.SetDow("Munday");
   System.out.printf(d2.day +"/"+ d2.month +"/"+ d2.year +"/"+ d2.dow); 
    
   }// main ends here
}// TestDate class end here