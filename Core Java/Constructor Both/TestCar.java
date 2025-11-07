class Car
{
    String model;
    String brand;
    String color;
    double price;

    Car()                                 //default constractor
    {
    System.out.println("constructor called");
    this.model="Swift Dzire";
    this.brand="Maruti Suzuki";
    this.color="White";
    this.price=79000;
    }

    Car(String m,String b,String c, double p)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.model=m;
    this.brand=b;
    this.color=c;
    this.price=p;
     }
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
   c1.display();
   c2 = new Car("Nexon","Tata Motors","Blue",102000);
   c2.display();
   }// main ends here
}// TestCar class end here

