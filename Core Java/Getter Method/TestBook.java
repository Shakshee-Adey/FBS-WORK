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
    
} // Book class end here
class TestBook
{
  public static void main(String[] args)
  {
   Book b1,b2;
   b1 = new Book();
   b1.SetIsbn(1100);
   b1.SetBname("Atomic Habit");
   b1.SetCategory("self");
   b1.SetPrice(200);
   System.out.printf(b1.isbn +"/"+ b1.bname +"/"+ b1.category +"/"+ b1.price); 

   b2 = new Book();
   b2.SetIsbn(3100);
   b2.SetBname("The sicret");
   b2.SetCategory("Motivational");
   b2.SetPrice(500);
   System.out.printf(b2.isbn +"/"+ b2.bname +"/"+ b2.category +"/"+ b2.price); 
 

   }// main ends here
}// TestBook class end here
