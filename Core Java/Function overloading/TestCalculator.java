class Calculator
{  
   void add(int a,int b) {
        System.out.println("fun1");
        System.out.println(a+b);
    }

    void add(float a,int b) {
        System.out.println("fun2");
        System.out.println(a+b);
    }

    void add(int a,float b) {
        System.out.println("fun3");
        System.out.println(a+b);
    }

    void add(double a,double b) {
        System.out.println("fun4");
        System.out.println(a+b);

    void subtract(int a,int b) {
        System.out.println("fun1");
        System.out.println(a-b);
    }

    void subtract(float a,int b) {
        System.out.println("fun2");
        System.out.println(a-b);
    }

    void subtract(int a,float b) {
        System.out.println("fun3");
        System.out.println(a-b);
    }

    void subtract(double a,double b) {
        System.out.println("fun4");
        System.out.println(a-b);
    } 
}  //Calculator class end here
  class TestCalculator
  {
    public static void main(String[] args)
    {
      Calculator a1 = new Calculator();
      Calculator s1 = new Calculator();
      int a=10;
      double d=10.3;
      float f=9.3f;
      a1.add(a,a);
      a1.add(f,a);
      a1.add(f,a);
      a1.add(d,d);
      s1.subtract(a,a);
      s1.subtract(f,a);
      s1.subtract(f,a);
      s1.subtract(d,d);
}  //main end here
}  // TestCalculator class end here

