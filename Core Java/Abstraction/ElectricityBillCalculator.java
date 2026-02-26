package abstruct;

import java.util.Scanner;

public abstract class ElectricityBillCalculator {
	
	int units;
	String customerName;
	double billAmount;
	
	public ElectricityBillCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElectricityBillCalculator(int units, String customerName) {
		super();
		this.units = units;
		this.customerName = customerName;
		
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void showUsage()
	{
	 System.out.println("customer Name is : "+customerName);
	 System.out.println("customer Consume the Units :"+units);
	 
	}
	
	abstract double calculateBill();
	
	public final void genrateBill()
	{
		billAmount = calculateBill();
		
		billAmount=billAmount+(billAmount*0.05);
		
		billAmount=billAmount+50;
		
		System.out.println("Units Consumed :"+units);
		System.out.println("Final Bill is : "+billAmount);
	}
}
class ResidentialBill extends ElectricityBillCalculator
{

	public ResidentialBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResidentialBill(int units, String customerName) {
		super(units, customerName);
		// TODO Auto-generated constructor stub
	}
	
	double calculateBill()
	{
		int units = getUnits();
        double billAmount = 0;
        
		if(units<=100)
		{
			billAmount=units*2.5;
		}
		else if(units<=300)
		{
			billAmount =(100*2.5)+((units - 100)*3.5);
		}
		else
		{
			billAmount = (100*2.5)+(200*3.5)+((units - 100)*3.5);
		}
		
		//extra subcharges condition 
		if(units>500)
		{
			billAmount = billAmount + 150;
		}
		
		return billAmount;
	}
}
class CommercialBill extends ElectricityBillCalculator
{
    
	
	public CommercialBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommercialBill(int units, String customerName) {
		super(units, customerName);
		// TODO Auto-generated constructor stub
	}
	
	double calculateBill()
	{
		int units = getUnits();
        double billAmount = 0;
        
		billAmount = units*6.5;
		
		if(units<200 && billAmount<1500)
		{
			billAmount = 1500;
		}
		if(units > 1000)
		{
			double subcharge = billAmount * 0.08;
			billAmount = billAmount + subcharge;
		}
		return billAmount;
	}
}

 class ElectricityBillTest {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Ask customer type
	        System.out.println("Select Customer Type:");
	        System.out.println("1. Residential");
	        System.out.println("2. Commercial");
	        System.out.print("Enter choice (1 or 2): ");
	        int choice = sc.nextInt();

	        // Input customer details
	        sc.nextLine(); // consume newline
	        System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Units Consumed: ");
	        int units = sc.nextInt();

	        ElectricityBillCalculator bill = null;

	        // Create appropriate object
	        if (choice == 1) {
	            bill = new ResidentialBill(units,name);
	            System.out.println("\n--- Residential Electricity Bill ---");

	        } else if (choice == 2) {
	            bill = new CommercialBill(units,name);
	            System.out.println("\n--- Commercial Electricity Bill ---");

	        } else {
	            System.out.println("Invalid customer type selected");
	            return;
	        }

	        // Generate and display bill
	        System.out.println("Customer Name : " + name);
	        bill.genrateBill();

	        sc.close();
	    }
	}
