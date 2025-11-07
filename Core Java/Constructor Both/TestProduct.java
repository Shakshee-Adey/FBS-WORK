class Product
{
    int pid;
    String pname;
    int quantity;
    double price;

    Product()                                 //default constractor
    {
    System.out.println("constructor called");
    this.pid=1001;
    this.pname="Smartwatch";
    this.quantity=10;
    this.price=500;
    }

    Product(int i,String n,int q, double p)   //parameterized constructor
    {
    this.pid=i;
    this.pname=n;
    this.quantity=q;
    this.price=p;
     }

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
   Product p1,p2;
   p1 = new Product();
   p1.display();
   p2 = new Product(1002,"Laptop",6,25000);
   p2.display();

   
   }             // main ends here
}           // TestProduct class end here