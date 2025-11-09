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

                        // Getter 
    int getPid() {
        return this.pid;
    }

    String getPname() {
        return this.pname;
    }

    int getQuantity() {
        return this.quantity;
    }

    double getPrice() {
        return this.price;
    }
}                           // Product class end here
class TestProduct
{
  public static void main(String[] args)
  {
   Product p1,p2;
   p1 = new Product();
   p1.SetPid(110);
   p1.SetPname("Copy");
   p1.SetQuantity(200);
   p1.SetPrice(50);
   System.out.printf(p1.pid +"/"+ p1.pname +"/"+ p1.quantity +"/"+ p1.price); 

   p2 = new Product();
   p2.SetPid(112);
   p2.SetPname("pen");
   p2.SetQuantity(60);
   p2.SetPrice(10);
   System.out.printf(p2.pid +"/"+ p2.pname +"/"+ p2.quantity +"/"+ p2.price); 

   if(p1.getPrice() > p2.getPrice()) {
            System.out.println("p1 highest price");
        } else if (p1.getPrice() < p2.getPrice()) {
            System.out.println("p2 highest price");
        } 

   
   }             // main ends here
}           // TestProduct class end here