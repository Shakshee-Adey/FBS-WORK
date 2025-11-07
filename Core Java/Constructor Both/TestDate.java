class Date
{
    int day,month,year;
    String dow;

    Date()                                 //default constractor
    {
    System.out.println("constructor called");
    this.day=17;
    this.month=10;
    this.year=2002;
    this.dow="Thursday";
    }

    Date(int d,int m,int y, String str)   //parameterized constructor
    {
     this.day=d;
    this.month=m;
    this.year=y;
    this.dow=str;
     }

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
   Date d1,d2;
   d1 = new Date();
   d1.display();
   d2 = new Date(5,9,2025,"sunday");
   d2.display();
    
   }// main ends here
}// TestDate class end here
