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
    

                                         // Display function
    void display() {
        System.out.println("Car Model : " + this.model);
        System.out.println("Car Brand : " + this.brand);
        System.out.println("car Color  : " + this.color);
        System.out.println("Car Price   : " + this.price);
    }
    
} // Car class end here
class TestCar
{
  public static void main(String[] args)
  {
   Car c1,c2;
   c1 = new Car();
   c1.SetModel("nexon");
   c1.SetBrand("Tata");
   c1.SetColor("red");
   c1.SetPrice(237000);
   c1.display();
   }// main ends here
}// TestCar class end here

