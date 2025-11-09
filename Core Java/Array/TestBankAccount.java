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
   BankAccount arr[]=new BankAccount[3];
   arr[0]=new BankAccount();
   arr[1]=new BankAccount(11489,"shakshee",560,12);
   arr[2]=new BankAccount(115890,"prachi",9600,1);
   int i;
   for(i=0; i<arr.length; i++)
   {
     arr[i].display();
    }
   
}// main class end here
}//TestBankAccount end here