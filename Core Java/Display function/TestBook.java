class Book
{
    int isbn;
    String bname;
    String category;
    double price;
    
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
   Book b1;
   b1 = new Book();
   
   b1.SetIsbn(1200);
   b1.SetBname("Atomic Habit");
   b1.SetCategory("Self");
   b1.SetPrice(200);
   b1.display();
   }// main ends here
}// TestBook class end here

