package View;

import java.util.Scanner;

import Controller.employeeController;
import Model.Admin;
import Model.Hr;
import Model.SalesManager;
import Model.employee;

public class employeeView {
     employeeController ec; 
     Scanner sc= new Scanner(System.in);
     public employeeView(employeeController ec)  //  constructor 
     {
    	 this.ec=ec;
     }
	
     public void showOptions()    //showing menu 
	{
		int choice =0;
		
		do{
			System.out.println("1. Add an Employee");
			System.out.println("2. Search an Employee");
			System.out.println("3. Update an Employee");
			System.out.println("4. Delete an Employee");
			System.out.println("5. Display all Employee");
			System.out.println("0. Exit");
			System.out.println("Enter your choice :- ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Enter Employee Type (1-Hr, 2-Admin , 3-SalesManager): ");
			int type = sc.nextInt();
			
			System.out.print("Enter ID : ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name : ");
			String name = sc.nextLine();
			System.out.print("Enter Base Salary : ");
			double salary = sc.nextDouble();
			
			if(type == 1)
			{
				System.out.print("Enter Commission : ");
				double comm = sc.nextDouble();
				ec.addEmployee(new Hr(id,name,salary,comm));
				System.out.print("HR added succrssfully!");
			}else if(type==2)
			{
				System.out.print("Enter Allowance : ");
				double allowance = sc.nextDouble();
				ec.addEmployee(new Admin(id,name,salary,allowance));
				System.out.print("Admin added succrssfully!");
			}else if(type==3)
			{
				System.out.print("Enter Incentive per Target : ");
				double incentives = sc.nextDouble();
				System.out.print("Enter Target : ");
				int target = sc.nextInt();
				ec.addEmployee(new SalesManager(id,name,salary,incentives,target));
				System.out.print("SalesManger added succrssfully!");
			}else
			{
				System.out.println("Invaild type!");
			}
			break;
			case 2: 
				System.out.println("Enter id to search ");
				id = sc.nextInt();
				employee e = ec.searchEmployee(id);
				if(e != null)
				{
					System.out.println("Found: "+ e);
				}
				else
				{
					System.out.println("Employee not Found. ");
				}
				break;
			case 3:
				System.out.println("Enter id to Update ");
				id = sc.nextInt();
				System.out.println("Enter new salary : ");
				salary = sc.nextDouble();
				if(ec.updateEmployee(id,salary))
				{
					System.out.println("update successfully!");
				}
				else
				{
					System.out.println("Employee not Found. ");
				}
				break;
			case 4:
				System.out.println("Enter id to delete: ");
				id = sc.nextInt();
				if(ec.deleteEmployee(id))
				{
					System.out.println("Deleted Successfully! ");
				}
				else
				{
					System.out.println("Employee not Found. ");
				}
				break;
			case 5:
				ec.displayAll();
				break;
		       }
		}while(choice!=0);
		System.out.println("Program Exited");
		
	}
}