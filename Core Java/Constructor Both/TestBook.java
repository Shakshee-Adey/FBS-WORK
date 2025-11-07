class Book
{
    int isbn;
    String bname;
    String category;
    double price;
 
    Book()                                 //default constractor
    {
    System.out.println("constructor called");
    this.isbn=11156;
    this.bname="Atomic habit";
    this.category="Self Help";
    this.price=600;
    }

    Book(int i,String n,String s,double a)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.isbn=i;
    this.bname=n;
    this.category=s;
    this.price=a;
     }
    
    void SetIsbn(int i)
    {
     this.isbn=i;
    }
    void SetBname(String b)
    {
    this.bname=b;
    }
    void SetCategory(String c)
    {
    this.category=c;
    }
    void SetPrice(double p)
    {
    this.price=p;
    }

                                    // Getter 
    int getId() {
        return this.isbn;
    }

    String getBname() {
        return this.bname;
    }
    String getCategory()
    {
      return this.category;
    }
    double getPrice()
    {
      return this.price;
    }
                                        // Display function
    void display() {
        System.out.println("Book Isbn : " + this.isbn);
        System.out.println("Book Name : " + this.bname);
        System.out.println("Book Category : " + this.category);
        System.out.println("Book Price : " + this.price);
}
    
} // Book class end here
class TestBook
{
  public static void main(String[] args)
  {
   Book b1,b2;
   b1 = new Book();
   b1.display();
   b2 = new Book(11147,"The Alchemist","Fiction",900);
   b2.display();
   }// main ends here
}// TestBook class end here

