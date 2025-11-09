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
   d2 = new Distance();

   d1.SetKm(100);
   d1.SetM(10);
   d2.SetKm(190);
   d2.SetM(11);
   d1.display();
   d2.display();
   }// main ends here
}// TestDistance class end here
