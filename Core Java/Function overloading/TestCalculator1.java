class Calculator
{  
   void add(int a,int b)
   {
        System.out.println("fun1");
        System.out.println(a+b);
    }

    void add(double a,int b)
    {
        System.out.println("fun2");
        System.out.println(a+b);
    }

    void add(int a,double b) 
   {
        System.out.println("fun3");
        System.out.println(a+b);
    }

    void add(double a,double b) 
     {
        System.out.println("fun4");
        System.out.println(a+b);
     }
    void subtract(int a,int b) {
        System.out.println("fun1");
        System.out.println(a-b);
    }

    void subtract(double a,int b)
    {
        System.out.println("fun2");
        System.out.println(a-b);
    }

    void subtract(int a,double b) {
        System.out.println("fun3");
        System.out.println(a-b);
    }

    void subtract(double a,double b)
    {
        System.out.println("fun4");
        System.out.println(a-b);
    }
    
    void mul(int a,int b)
   {
        System.out.println("fun1");
        System.out.println(a*b);
    }

    void mul(double a,int b)
   {
        System.out.println("fun2");
        System.out.println(a*b);
    }

    void mul(int a,double b) 
    {
        System.out.println("fun3");
        System.out.println(a*b);
    }

    void mul(double a,double b)
    {
        System.out.println("fun4");
        System.out.println(a*b);
    } 
    
    void divide(int a,int b)
    {
        System.out.println("fun1");
        System.out.println(a*b);
    }

    void divide(double a,int b) {
        System.out.println("fun2");
        System.out.println(a/b);
    }

    void divide(int a,double b)
    {
        System.out.println("fun3");
        System.out.println(a/b);
    }

    void divide(double a,double b)
    {
        System.out.println("fun4");
        System.out.println(a/b);
    }
}  //Calculator class end here
  class TestCalculator1
  {
    public static void main(String[] args)
    {
      Calculator a1 = new Calculator();
      Calculator s1 = new Calculator();
      Calculator m1 = new Calculator();
      Calculator d1 = new Calculator();
      int a=10;
      double d=10.3;
      //float f=9.3f;
      a1.add(a,a);
      a1.add(d,a);
      a1.add(a,d);
      a1.add(d,d);
       
      s1.subtract(a,a);
      s1.subtract(d,a);
      s1.subtract(a,d);
      s1.subtract(d,d);
      
      m1.mul(a,a);
      m1.mul(d,a);
      m1.mul(a,d);
      m1.mul(d,d);
      
      d1.divide(a,a);
      d1.divide(d,a);
      d1.divide(a,d);
      d1.divide(d,d);
}  //main end here
}  // TestCalculator class end here

