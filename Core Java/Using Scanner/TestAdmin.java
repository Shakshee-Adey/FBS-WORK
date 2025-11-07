import java.util.Scanner;
class Admin
{
    int id;
    String name;
    double salary;
    double allowance;

    Admin()                                 //default constractor
    {
    System.out.println("constructor called");
    this.id=111;
    this.name="Shital";
    this.salary=97000;
    this.allowance=600;
    }

    Admin(int i,String n,double s,double a)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.id=i;
    this.name=n;
    this.salary=s;
    this.allowance=a;
     }
    void SetId(int i)
    {
     this.id=i;
    }
    void SetName(String n)
    {
    this.name=n;
    }
    void SetSalary(double s)
    {
    this.salary=s;
    }
    void SetAllowance(double a)
    {
    this.allowance=a;
    }

                                    // Getter 
    int getId() {
        return this.id;
    }

    String getName() {
        return this.name;
    }
    double getSalary()
    {
      return this.salary;
    }
    double getAllowance()
    {
      return this.allowance;
    }
                                        // Display function
    void display() {
        System.out.println("Admin Id : " + this.id);
        System.out.println("Admin Name : " + this.name);
        System.out.println("Admin salary : " + this.salary);
        System.out.println("Admin Allowance : " + this.allowance);
}
} // Admin class end here
class TestAdmin
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Admin id :- ");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Admin name :- ");
    String name = sc.nextLine();
    System.out.println("Enter Admin salary :- ");
    double salary = sc.nextDouble();
    System.out.println("Enter Allowance :- ");
    double allowance = sc.nextDouble();
    
    Admin a1 = new Admin(id,name,salary,allowance);
    a1.display();
    
   }// main ends here
}// TestAdmin class end here

