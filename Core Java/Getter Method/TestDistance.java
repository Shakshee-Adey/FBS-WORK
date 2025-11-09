class Distance
{
    double km;
    double m;

    void SetKm(double k)  //setters
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
    
} // Distance class end here
class TestDistance
{
  public static void main(String[] args)
  {
   Distance d1,d2;
   d1 = new Distance();
   d1.SetKm(110);
   d1.SetM(12);
   System.out.printf(d1.km +"/"+ d1.m ); 

   d2 = new Distance();
   d2.SetKm(112);
   d2.SetM(225);
   System.out.printf(d1.km +"/"+ d1.m );

   if(d1.getKm() > d2.getKm()) {
            System.out.println("d1 highest km");
        } else if (d1.getKm() < d2.getKm()) {
            System.out.println("d2 highest Km");
        } 
   }// main ends here
}// TestDistance class end here

