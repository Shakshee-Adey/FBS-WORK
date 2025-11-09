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
   Product p1;
   p1 = new Product();
   p1.SetPid(29);
   p1.SetPname("Shakshee");
   p1.SetQuantity(2);
   p1.SetPrice(200);
   p1.display();
   

   
   }             // main ends here
}           // TestProduct class end here