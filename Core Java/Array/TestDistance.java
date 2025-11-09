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
   Distance arr[]=new Distance[3];
   arr[0]=new Distance();
   arr[1]=new Distance(114,56);
   
   int i;
   for(i=0; i<arr.length; i++)
   {
     arr[i].display();
    }
   }// main ends here
}// TestDistance class end here       //output   Distance in km : 151.0
                        //Distance in m : 10.0
                       //Distance in km : 114.0
                      //Distance in m : 56.0
                       //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Distance.display()" because "<local1>[<local2>]" is null
                   // at TestDistance.main(TestDistance.java:56)
