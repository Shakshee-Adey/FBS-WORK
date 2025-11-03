class ComplexNo
{
    int real;
    int imaginary;
    void SetReal(int r)
    {
     this.real=r;
    }
    void SetImaginary(int i)
    {
    this.imaginary=i;
    }
    
} // complexno class end here
class TestComplexNo
{
  public static void main(String[] args)
  {
   ComplexNo c1;
   c1 = new ComplexNo();
   c1.SetReal(2);
   c1.SetImaginary(5);
   System.out.println("Complex No :" c1.real + "+" + c1.imaginary +"i"); 
   }// main ends here
}// TestComplexNo class end here

