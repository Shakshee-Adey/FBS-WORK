package abstruct;

import java.util.Scanner;

abstract class InsurancePolicy {
	
	String policyHolderName;
    double basePremium;

    public InsurancePolicy(String policyHolderName, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    
    public String getPolicyHolderName() {
		return policyHolderName;
	}


	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}


	public double getBasePremium() {
		return basePremium;
	}


	public void setBasePremium(double basePremium) {
		this.basePremium = basePremium;
	}


	abstract double calculatePremium();

    public void printPolicyDetails() {
        System.out.println("\n----- Policy Details -----");
        System.out.println("Policy Holder Name : " + policyHolderName);
        System.out.println("Base Premium       : " + basePremium);
        System.out.println("Final Premium      : " + calculatePremium());
    }
}

// Car Insurance Class
class CarInsurance extends InsurancePolicy {

    int carAgeInYears;
    boolean hadAccidentInLastYear;
    double carValue;

    public CarInsurance(String name, double basePremium,int carAgeInYears, boolean hadAccidentInLastYear,double carValue) {

        super(name, basePremium);
        this.carAgeInYears = carAgeInYears;
        this.hadAccidentInLastYear = hadAccidentInLastYear;
        this.carValue = carValue;
    }
    

    public int getCarAgeInYears() {
		return carAgeInYears;
	}


	public void setCarAgeInYears(int carAgeInYears) {
		this.carAgeInYears = carAgeInYears;
	}


	public boolean isHadAccidentInLastYear() {
		return hadAccidentInLastYear;
	}


	public void setHadAccidentInLastYear(boolean hadAccidentInLastYear) {
		this.hadAccidentInLastYear = hadAccidentInLastYear;
	}


	public double getCarValue() {
		return carValue;
	}


	public void setCarValue(double carValue) {
		this.carValue = carValue;
	}


	@Override
    double calculatePremium() {

        double finalPremium = basePremium;

        // Age based loading
        if (carAgeInYears <= 3) {
            finalPremium += basePremium * 0.10;
        } else if (carAgeInYears <= 7) {
            finalPremium += basePremium * 0.20;
        } else {
            finalPremium += basePremium * 0.30;
        }

        // Accident condition
        if (hadAccidentInLastYear) {
            finalPremium += finalPremium * 0.25;
        } else {
            finalPremium -= finalPremium * 0.10;
        }

        // High value car
        if (carValue > 1000000) {   // 10 Lakhs
            finalPremium += 2000;
        }

        return finalPremium;
    }
}


// Health Insurance Class
class HealthInsurance extends InsurancePolicy {

    int age;
    boolean isSmoker;
    boolean hasPreExistingDisease;

    public HealthInsurance(String name, double basePremium,
                           int age,
                           boolean isSmoker,
                           boolean hasPreExistingDisease) {

        super(name, basePremium);
        this.age = age;
        this.isSmoker = isSmoker;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

    
    public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isSmoker() {
		return isSmoker;
	}


	public void setSmoker(boolean isSmoker) {
		this.isSmoker = isSmoker;
	}


	public boolean isHasPreExistingDisease() {
		return hasPreExistingDisease;
	}


	public void setHasPreExistingDisease(boolean hasPreExistingDisease) {
		this.hasPreExistingDisease = hasPreExistingDisease;
	}


	@Override
    double calculatePremium() {

        double finalPremium = basePremium;

        // Age factor
        if (age >= 30 && age <= 50) {
            finalPremium += basePremium * 0.15;
        } else if (age > 50) {
            finalPremium += basePremium * 0.30;
        }

        // Smoker
        if (isSmoker) {
            finalPremium += finalPremium * 0.20;
        }

        // Pre-existing disease
        if (hasPreExistingDisease) {
            finalPremium += finalPremium * 0.25;
        }

        return finalPremium;
    }
}


// Main Class (Only Public Class)
class InsuranceTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Policy Type:");
        System.out.println("1. Car Insurance");
        System.out.println("2. Health Insurance");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Policy Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Base Premium: ");
        double basePremium = sc.nextDouble();

        InsurancePolicy policy = null;

        if (choice == 1) {

            System.out.print("Enter Car Age: ");
            int carAge = sc.nextInt();

            System.out.print("Had accident last year? (true/false): ");
            boolean accident = sc.nextBoolean();

            System.out.print("Enter Car Value: ");
            double carValue = sc.nextDouble();

            policy = new CarInsurance(name, basePremium, carAge, accident, carValue);

        } else if (choice == 2) {

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Are you smoker? (true/false): ");
            boolean smoker = sc.nextBoolean();

            System.out.print("Pre-existing disease? (true/false): ");
            boolean disease = sc.nextBoolean();

            policy = new HealthInsurance(name, basePremium, age, smoker, disease);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        policy.printPolicyDetails();

        sc.close();
    }
}
