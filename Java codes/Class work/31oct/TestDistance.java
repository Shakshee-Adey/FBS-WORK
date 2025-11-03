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
    
} // Distance class end here
class TestDistance
{
  public static void main(String[] args)
  {
   Distance d;
   d = new Distance();
   d.SetKm(1100);
   d.SetM(10);
   System.out.printf(d.km +"/"+ d.m); 
   }// main ends here
}// TestDistance class end here

