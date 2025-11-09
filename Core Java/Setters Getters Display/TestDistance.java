class Distance
{
    double km;
    double m;

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
   Distance d1,d2;
   d1 = new Distance();
   d1.SetKm(1200);
   d1.SetM(100);
   d1.display();
   }// main ends here
}// TestDistance class end here

