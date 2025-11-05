class Employee {
    int eid;
    String name;
    String department;
    double salary;

     Employee()                                 //default constractor
    {
    System.out.println("constructor called");
    this.eid=101;
    this.name="Prachi";
    this.department="HR";
    this.salary=25000;
    }

    Employee(int i,String n,String d, int s)   //parameterized constructor
    {
     this.eid=i;
    this.name=n;
    this.department=d;
    this.salary=s;
     }

                          // Setter 
    void setEid(int id) {
        this.eid = id;
    }

    void setName(String n) {
        this.name = n;
    }

    void setDepartment(String dept) {
        this.department = dept;
    }

    void setSalary(double sal) {
        this.salary = sal;
    }

    // Getter 
    int getEid() {
        return this.eid;
    }

    String getName() {
        return this.name;
    }

    String getDepartment() {
        return this.department;
    }

    double getSalary() {
        return this.salary;
    }

    // Display function
    void display() {
        System.out.println("Employee ID   : " + this.eid);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Department    : " + this.department);
        System.out.println("Salary        : " + this.salary);
    }
} // Employee class end here


class Testemp {
    public static void main(String[] args) {
        
        Employee e1,e2;
        e1 = new Employee();
        e1.display();

       
        e2 = new Employee(102,"vanee","Manager",30000);
        e2.display();

  
    } // main end here
} // Testemp class end here
