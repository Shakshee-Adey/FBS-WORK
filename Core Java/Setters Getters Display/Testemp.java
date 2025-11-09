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
        
        Employee e1;
        e1 = new Employee();

        e1.SetEid(190);
        e1.SetName("Shskahee");
        e1.SetDepartment("Hr");
        e1.SetSalary(2370);
        e1.display();
        

  
    } // main end here
} // Testemp class end here
