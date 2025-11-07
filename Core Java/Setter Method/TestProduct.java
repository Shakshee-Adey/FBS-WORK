class Product
{
    int pid;
    String pname;
    int quantity;
    double price;
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
    
} // Product class end here
class TestProduct
{
  public static void main(String[] args)
  {
   Product d;
   d = new Product();
   d.SetPid(201);
   d.SetPname("perfume");
   d.SetQuantity(400);
   d.SetPrice(300);
   System.out.printf(d.pid +"/"+ d.pname+"/"+ d.quantity+"/"+ d.price); 
   }// main ends here
}// TestProduct class end here
