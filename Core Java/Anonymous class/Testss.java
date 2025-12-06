interface Mall
  {
    void discount();
  }
class FashionMall implements Mall
  {
   public void discount()
  {
      System.out.println("20% discount given");
   }
  }
public class testss
{
  public static void main(String args[])
  {
     Mall m1 = new FashionMall();
     m1.discount();

     Mall m2 = new FashionMall();
     m2.discount();
     
           // Anonymous class
     Mall m3 = new Mall()
    {
       public void discount()
       {
         System.out.println("50% discount ");
       }
     };
     m3.discount();
  }
}