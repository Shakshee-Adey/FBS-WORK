import java.util.Scanner;
class ElectricityBill
{
   int custId;
   String custName;
   int unitsConsumed;
   static double ratePerUnit;

   static
   {
    ratePerUnit=9.6;
   }

   ElectricityBill()                                 //default constractor
    {
    System.out.println("constructor called");
    this.custId=1512;
    this.custName="Bharti";
    this.unitsConsumed=9;
    //this.ratePerUnit=12;
    }

    ElectricityBill(int i,String h,int b)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.custId=i;
    this.custName=h;
    this.unitsConsumed=b;
    // this.ratePerUnit=r;
     }
                                       //setter start here
    void SetCustId(int i)
    {
     this.custId=i;
    }
    void SetCustName(String n)
    {
    this.custName=n;
    }
    void SetUnitsConsumed(int m)
    {
    this.unitsConsumed=m;
    }
    static void SetratePerUnit(double s)     //change here the code write static and remove this
    {
    ratePerUnit=s;
    }                               //setter end here
     
                                    // Getter start here
    int getCustId() {
        return this.custId;
    }
    String getCustName() {
        return this.custName;
    }
    int getUnitsConsumed()
    {
      return this.unitsConsumed;
    }
    double getratePerUnit()
    {
      return this.ratePerUnit;
    }
    
                                           // Display function
    void display() {
        System.out.println("\ncustid: " + custId);
        System.out.println("cusName: " + custName);
        System.out.println("unitsConsumed : " + unitsConsumed );
        System.out.println("ratePerUnit : " + ratePerUnit);
    }
} // ElectricityBill class end here
class TestElectricityBill
{
  public static void main(String[] args)
  {
    ElectricityBill e1 = new ElectricityBill(1234,"shakshee",11);
    e1.display();
    ElectricityBill e2 = new ElectricityBill(1235,"prachi",12);
    e2.display();
    ElectricityBill e3 = new ElectricityBill(1236,"rasu",14);
    e3.display();
    
    ElectricityBill.SetratePerUnit(10.8);
    //after updating
    e1.display();
    e2.display();
    e3.display();
    
   
}// main class end here
}//TestElectricityBill end here