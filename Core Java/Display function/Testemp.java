class Employee {
    int eid;
    String name;
    String department;
    double salary;
                          // Setter 
    void SetEid(int id) {
        this.eid = id;
    }

    void SetName(String n) {
        this.name = n;
    }

    void SetDepartment(String dept) {
        this.department = dept;
    }

    void SetSalary(double sal) {
        this.salary = sal;
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
        e2 = new Employee();

        e1.SetEid(102);
        e1.SetName("shakshee");
        e1.SetDepartment("Hr");
        e1.SetSalary(10000);
        
        
        e2.SetEid(122);
        e2.SetName("vani");
        e2.SetDepartment("Tr");
        e2.SetSalary(60000);
       

        e1.display();
        e2.display();

  
    } // main end here
} // Testemp class end here
