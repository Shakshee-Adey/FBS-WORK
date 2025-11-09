class Product
{
    int pid;
    String pname;
    int quantity;
    double price;

                         //setter
    void SetPid(int i)
    {
     this.pid=i;
    }
    void SetPname(String b)
    {
    this.pname=b;
    }
    void SetQuantity(int q)
    {
    this.quantity=q;
    }
    void SetPrice(double p)
    {
    this.price=p;
    }
                                         // Display function
    void display() {
        System.out.println("Product ID   : " + this.pid);
        System.out.println("Product Name : " + this.pname);
        System.out.println("Quantity    : " + this.quantity);
        System.out.println("Price    : " + this.price);
    }
    
}                           // Product class end here
class TestProduct
{
  public static void main(String[] args)
  {
   Product p1,p2;
   p1 = new Product();
   p2 = new Product();

   p1.SetPid(102);
   p1.SetPname("watch");
   p1.SetQuantity(10);
   p1.SetPrice(1030);
   
   p2.SetPid(122);
   p2.SetPname("earphones");
   p2.SetQuantity(100);
   p2.SetPrice(500);
   
    
   p1.display();
   p2.display();

   
   }             // main ends here
}           // TestProduct class end here