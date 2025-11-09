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

} // Employee class end here


class Testemp {
    public static void main(String[] args) {
        
   Employee e1,e2;
   e1 = new Employee();
   e1.SetEid(110);
   e1.SetName("Shakshee");
   e1.SetDepartment("IT");
   e1.SetSalary(9000);
   System.out.printf(e1.eid +"/"+ e1.name +"/"+ e1.department +"/"+ e1.salary); 

   e2 = new Employee();
   e2.SetEid(112);
   e2.SetName("Prachi");
   e2.SetDepartment("Hr");
   e2.SetSalary(6000);
   System.out.printf(e2.eid +"/"+ e2.name +"/"+ e2.department +"/"+ e2.salary); 
   

   if(e1.getSalary() > e2.getSalary()) {
            System.out.println("e1 highest Salary");
        } else if (e1.getSalary() < e2.getSalary()) {
            System.out.println("e2 highest Salary");
        } 

  
    } // main end here
} // Testemp class end here
