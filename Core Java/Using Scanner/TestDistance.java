import java.util.Scanner;
class Distance
{
    double km;
    double m;

    Distance()                                 //default constractor
    {
    System.out.println("constructor called");
    this.km=151;
    this.m=10;
    }

    Distance(double i,double n)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.km=i;
    this.m=n;
     }


    void SetKm(double k)
    {
     this.km=k;
    }
    void SetM(double m)
    {
    this.m=m;
    }

                                    // Getter 
    double getKm() {
        return this.km;
    }

    double getM() {
        return this.m;
    }
                                        // Display function
    void display() {
        System.out.println("Distance in km : " + this.km);
        System.out.println("Distance in m : " + this.m);
    }
    
} // Distance class end here
class TestDistance
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Distance km :- ");
    double k1 = sc.nextDouble();
    System.out.println("Enter Distance m :- ");
    double k2 = sc.nextDouble();
    
    Distance d1 = new Distance(k1,k2);
    d1.display();
   }// main ends here
}// TestDistance class end here

