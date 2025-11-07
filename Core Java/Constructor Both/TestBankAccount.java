import java.util.Scanner;
class BankAccount
{
   int accountNumber;
   String accHolderName;
   double userBallance;
   double interestRate;

   BankAccount()                                 //default constractor
    {
    System.out.println("constructor called");
    this.accountNumber=151245;
    this.accHolderName="Bharti";
    this.userBallance=97000;
    this.interestRate=100;
    }

    BankAccount(int i,String h,double b,double r )   //parameterized constructor
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
class TestBankAccount
{
  public static void main(String[] args)
  {
   BankAccount b1,b2;
   b1 = new BankAccount();
   b1.display();
   b2 = new BankAccount(12976,"Sitara",67000,200);
   b2.display();
   
}// main class end here
}//TestBankAccount end here