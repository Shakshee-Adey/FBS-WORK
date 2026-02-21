package com.ash.demos;

import java.util.Scanner;

public class MainApp {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		
		EmployeeManagement empMgr = new EmployeeManagement();
		
	do {
			System.out.println("\t1.Add");
			System.out.println("\t2.Search(By ID)");
			System.out.println("\t3.Update(By ID)");
			System.out.println("\t4.Delete(By ID)");
			System.out.println("\t5.Display(All)");
			System.out.println("\t6.Exit");
			System.out.println("Enter your choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:{
				empMgr.addEmp();
				break;
			}
			case 2:{
				empMgr.searchEmp();
				break;
			}
		case 3:{
			empMgr.updateEmp();
				break;
			}
			case 4:{
				empMgr.deleteEmp();
				break;
			}
			case 5:{
				empMgr.displayAll();
				break;
			}
			case 6:{
				System.out.println("Exiting....");
			}
			default:{
				System.out.println("-----INVALID CHOICE-----");
			}
		}
		}while(choice!=6);
	}

}
