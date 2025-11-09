class Car
{
    String model;
    String brand;
    String color;
    double price;
                                    //setter
    void SetModel(String m)
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

                                    // Getter 
    String getModel() {
        return this.model;
    }

    String getBrand() {
        return this.brand;
    }
    String getColor()
    {
      return this.color;
    }

    double getPrice() {
        return this.price;
    }
    
} // Car class end here
class TestCar
{
  public static void main(String[] args)
  {
   Car c1,c2;
   c1 = new Car();
   c1.SetModel("Swift");
   c1.SetBrand("Maruti");
   c1.SetColor("red");
   c1.SetPrice(1000000);
   System.out.printf(c1.model +"/"+ c1.brand +"/"+ c1.color +"/"+ c1.price); 

   c2 = new Car();
   c2.SetModel("Nexon");
   c2.SetBrand("Tata");
   c1.SetColor("blue");
   c1.SetPrice(2000000);
   System.out.printf(c1.model +"/"+ c1.brand +"/"+ c1.color +"/"+ c1.price);
   
   }// main ends here
}// TestCar class end here

