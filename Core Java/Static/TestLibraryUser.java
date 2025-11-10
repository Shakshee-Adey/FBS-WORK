import java.util.Scanner;
class LibraryUser
{
   String name;
   int daysLate;
   static double finePerDay;

   static
   {
    finePerDay=9.6;
   }

   LibraryUser()                                 //default constractor
    {
    System.out.println("constructor called");
    this.name="Bharti";
    this.daysLate=9;
    }

    LibraryUser(String n,int s)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.name=n;
    this.daysLate=s;
     }
                                       //setter start here
    void SetName(String n)
    {
    this.name=n;
    }
    void SetDaysLate(int m)
    {
    this.daysLate=m;
    }
    static void SetFinePerDay(double s)     //change here the code write static and remove this
    {
    finePerDay=s;
    }                               //setter end here
     
                                    // Getter start here
    String getName() {
        return this.name;
    }
    double getDaysLate()
    {
      return this.daysLate;
    }
    double getFinePerDay()
    {
      return this.finePerDay;
    }
    
                                           // Display function
    void display() {
        System.out.println("\nName: " + name);
        System.out.println("daysLate: " + daysLate);
        System.out.println("finePerDay: " + finePerDay);
       
    }
} // LibraryUser class end here
class TestLibraryUser
{
  public static void main(String[] args)
  {
    LibraryUser l1 = new LibraryUser("shakshee",11);
    l1.display();
    LibraryUser l2 = new LibraryUser("prachi",12);
    l2.display();
    LibraryUser l3 = new LibraryUser("rasu",14);
    l3.display();
    
    LibraryUser.SetFinePerDay(100.6);
    //after updating
    l1.display();
    l2.display();
    l3.display();
    
   
}// main class end here
}//TestLibraryUser end here