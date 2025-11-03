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
    
} // Book class end here
class TestBook
{
  public static void main(String[] args)
  {
   Book d;
   d = new Book();
   d.SetIsbn(2890);
   d.SetBname("PaperMoon");
   d.SetCategory("self");
   d.SetPrice(400);
   System.out.printf(d.isbn +"/"+ d.bname+"/"+ d.category+"/"+ d.price); 
   }// main ends here
}// TestBook class end here

