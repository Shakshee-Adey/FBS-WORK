import java.util.Scanner;
class Employee
{
   String name;
   double basicSalary;
   static double companyBonusRate;

   static
   {
    companyBonusRate=9.6;
   }

   Employee()                                 //default constractor
    {
    System.out.println("constructor called");
    this.name="Bharti";
    this.basicSalary=9000;
    }

    Employee(String n,double s)   //parameterized constructor
    {
    System.out.println("constructor called");
    this.name=n;
    this.basicSalary=s;
     }
                                       //setter start here
    void SetName(String n)
    {
    this.name=n;
    }
    void SetBasicSalary(double m)
    {
    this.basicSalary=m;
    }
    static void SetCompanyBonusRate(double s)     //change here the code write static and remove this
    {
    companyBonusRate=s;
    }                               //setter end here
     
                                    // Getter start here
    String getName() {
        return this.name;
    }
    double getBasicSalary()
    {
      return this.basicSalary;
    }
    double getCompanyBonusRate ()
    {
      return this.companyBonusRate;
    }
                                  // calculate t salary
    double calculateTotalSalary() {
        return basicSalary + (basicSalary * companyBonusRate / 100);
    }
    
                                           // Display function
    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Basicsalary: " + basicSalary);
        System.out.println("CompanyBonusRate: " + companyBonusRate );
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
} // Employee class end here
class TestEmployee
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee("shakshee",11000);
    e1.display();
    Employee e2 = new Employee("prachi",12000);
    e2.display();
    Employee e3 = new Employee("rasu",14000);
    e3.display();
    
    Employee.SetCompanyBonusRate(10.8);
    //after updating
    e1.display();
    e2.display();
    e3.display();
    
   
}// main class end here
}//TestEmployee end here