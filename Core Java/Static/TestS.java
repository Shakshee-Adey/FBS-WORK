import java.util.Scanner;
class BankAccount
{
   int accountNumber;
   String accHolderName;
   double userBallance;
   static double interestRate;

   BankAccount()                                 //default constractor
    {
    System.out.println("constructor called");
    this.accountNumber=151245;
    this.accHolderName="Bharti";
    this.userBallance=97000;
    this.interestRate=12;
    }

    BankAccount(int i,String h,double b,double r)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.accountNumber=i;
    this.accHolderName=h;
    this.userBallance=b;
     this.interestRate=r;
     }
                                       //setter start here
    void SetAccountNumber(int i)
    {
     this.accountNumber=i;
    }
    void SetAccHolderName(String n)
    {
    this.accHolderName=n;
    }
    void SetUserBallance(double m)
    {
    this.userBallance=m;
    }
    void SetInterestRate(double s)
    {
    this.interestRate=s;
    }                               //setter end here
     
                                    // Getter start here
    int getAccountNumber() {
        return this.accountNumber;
    }
    String getAccHolderName() {
        return this.accHolderName;
    }
    double getUserBallance()
    {
      return this.userBallance;
    }
    double getInterestRate()
    {
      return this.interestRate;
    }
    
                                           // Display function
    void display() {
        System.out.println("BankAccount accountNumber: " + accountNumber);
        System.out.println("BankAccount accHolderName: " + accHolderName);
        System.out.println("BankAccount userBallance : " + userBallance);
        System.out.println("BankAccount interestRate : " + interestRate);
    }
} // BankAccount class end here
class TestS
{
  public static void main(String[] args)
  {
    BankAccount b1 = new BankAccount(1234,"shakshee",2000,12);
    b1.display();
    BankAccount b2 = new BankAccount(12345,"prachi",3000,12.5);
    b2.display();
    BankAccount b3 = new BankAccount(1236,"rasu",4000,13);
    b3.display();
    b1.display();
    b2.display();
   
}// main class end here
}//TestS end here