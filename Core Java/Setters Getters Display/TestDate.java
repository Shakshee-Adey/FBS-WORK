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
   Date d1;
   d1 = new Date();

   d1.SetDay(12);
   d1.SetMonth(5);
   d1.SetYear(2027);
   d1.SetDow("munday");
   d1.display();
   
    
   }// main ends here
}// TestDate class end here