class Car
{
    int model;
    String brand;
    String color;
    double price;
    void SetModel(int m)
    {
     this.model=m;
    }
    void SetBrand(String b)
    {
    this.brand=b;
    }
    void SetColor(String c)
    {
    this.color=c;
    }
    void SetPrice(double p)
    {
    this.price=p;
    }
    
} // Car class end here
class TestCar
{
  public static void main(String[] args)
  {
   Car d;
   d = new Car();
   d.SetModel(2025);
   d.SetBrand("maruti");
   d.SetColor("red");
   d.SetPrice(50000);
   System.out.printf(d.model +"/"+ d.brand+"/"+ d.color+"/"+ d.price); 
   }// main ends here
}// TestCar class end here

