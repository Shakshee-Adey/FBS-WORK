import java.util.Scanner;
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
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Day is :- ");
    int day = sc.nextInt();
    System.out.println("Enter Month :- ");
    int month = sc.nextInt();
    System.out.println("Enter Year :- ");
    int year = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Day of the week :- ");
    String d1 = sc.nextLine();
    
    Date b1 = new Date(day,month,year,d1);
    b1.display();
    
   }// main ends here
}// TestDate class end here
