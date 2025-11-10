class Printer
{  
   void print() {
        System.out.println("Hi");
    }

    void print(int s) {
        System.out.println("int value: " + s);
    }

    void print(char c) {
        System.out.println("Char value: " + c);
    }

    void print(String str) {
        System.out.println("String value: " + str);
    } 
}  //printer class end here
  class TestPrinter
  {
    public static void main(String[] args)
    {
      Printer p1 = new Printer();
      p1.print();
      p1.print(20);
      p1.print('f');
      p1.print("shakshee");
}  //main end here
}  // TestPrinter class end here

