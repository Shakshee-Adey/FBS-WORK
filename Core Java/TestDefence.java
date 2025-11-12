class Defence {
      String NameOfHead;
	int noOfVehicles;
	String countryName;
	String locationOfHeadQuarter;
	double budget;
	int noOfDepartment;
	int noOfMissionsPerformed;
	

	// Constructor
	Defence(String nameOfHead, int noOfVehicles, String countryName,
			String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed) {
		super();
		NameOfHead = nameOfHead;
		this.noOfVehicles = noOfVehicles;
		this.countryName = countryName;
		this.locationOfHeadQuarter = locationOfHeadQuarter;
		this.budget = budget;
		this.noOfDepartment = noOfDepartment;
		this.noOfMissionsPerformed = noOfMissionsPerformed;
	}

	// Setters and Getters
	String getNameOfHead() {
		return NameOfHead;
	}

	void setNameOfHead(String nameOfHead) {
		NameOfHead = nameOfHead;
	}

	int getNoOfVehicles() {
		return noOfVehicles;
	}

	void setNoOfVehicles(int noOfVehicles) {
		this.noOfVehicles = noOfVehicles;
	}

	String getCountryName() {
		return countryName;
	}

	void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	String getLocationOfHeadQuarter() {
		return locationOfHeadQuarter;
	}

	void setLocationOfHeadQuarter(String locationOfHeadQuarter) {
		this.locationOfHeadQuarter = locationOfHeadQuarter;
	}

	double getBudget() {
		return budget;
	}

	void setBudget(double budget) {
		this.budget = budget;
	}

	int getNoOfDepartment() {
		return noOfDepartment;
	}

	void setNoOfDepartment(int noOfDepartment) {
		this.noOfDepartment = noOfDepartment;
	}

	int getNoOfMissionsPerformed() {
		return noOfMissionsPerformed;
	}

	void setNoOfMissionsPerformed(int noOfMissionsPerformed) {
		this.noOfMissionsPerformed = noOfMissionsPerformed;
	}

	// Display
	void display() {
		System.out.println("Name of Head: " + NameOfHead);
		System.out.println("no. of Vehicles: " + noOfVehicles);
		System.out.println("Country Name: " + countryName);
		System.out.println("lacation of Head Quarter: " + locationOfHeadQuarter);
		System.out.println("budget: " + budget);
		System.out.println("no. Of Departments: " + noOfDepartment);
		System.out.println("No. of Missions Performed: " + noOfMissionsPerformed);
		

	}
}

class army extends Defence {

	int noOfTanks;
	int noOfGuns;
	int noOfGrenade;
	int noOfBatallion;

	// Constructor
	army(String nameOfHead, int noOfVehicles, String countryName,
			String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed,int noOfTanks, int noOfGuns, int noOfGrenade, int noOfBatallion) {
		super(nameOfHead,noOfVehicles, countryName, locationOfHeadQuarter, budget,
				noOfDepartment, noOfMissionsPerformed);
		this.noOfTanks = noOfTanks;
		this.noOfGuns = noOfGuns;
		this.noOfGrenade = noOfGrenade;
		this.noOfBatallion = noOfBatallion;
	}

	// Setters and Getters
	int getNoOfTanks() {
		return noOfTanks;
	}

	void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}

	int getNoOfGuns() {
		return noOfGuns;
	}

	void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

       int getNoOfGrenade() {
		return noOfGrenade;
	}

	void setNoOfGrenade(int noOfGrenade) {
		this.noOfGrenade = noOfGrenade;
	}

	int getNoOfBatallion() {
		return noOfBatallion;
	}

	void setNoOfBatallion(int noOfBatallion) {
		this.noOfBatallion = noOfBatallion;
	}
	
	//Display
	
	void display() {
		super.display();
		System.out.println("No.of tanks: "+noOfTanks);
		System.out.println("No. of Guns: "+ noOfTanks);
		System.out.println("No. of Grenade: "+ noOfGrenade);
		System.out.println("NO. of Bttalions: "+ noOfBatallion);
	}
}

class Navy extends Defence{
	
	int noOfShips;
	int noOfSubmarines;
	int noOftorpedies;
	
	//Constructor
	Navy(String nameOfHead, int noOfVehicles, String countryName,
			String locationOfHeadQuarter, double budget, int noOfDepartment, int noOfMissionsPerformed,
			int noOfShips, int noOfSubmarines, int noOftorpedies) {
		super(nameOfHead,noOfVehicles, countryName, locationOfHeadQuarter, budget,
				noOfDepartment, noOfMissionsPerformed);
		this.noOfShips = noOfShips;
		this.noOfSubmarines = noOfSubmarines;
		this.noOftorpedies = noOftorpedies;
	}

	
	//Setters and Getters
	int getNoOfShips() {
		return noOfShips;
	}

	void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}

	 int getNoOfSubmarines() {
		return noOfSubmarines;
	}

	void setNoOfSubmarines(int noOfSubmarines) {
		this.noOfSubmarines = noOfSubmarines;
	}

	int getNoOftorpedies() {
		return noOftorpedies;
	}

	public void setNoOftorpedies(int noOftorpedies) {
		this.noOftorpedies = noOftorpedies;
	}
	
	//Display
	void display() {
		super.display();
		System.out.println("No.of Ships: "+noOfShips);
		System.out.println("No. of Submarines: "+noOfSubmarines);
		System.out.println("No. of Torpedies: "+ noOftorpedies);
	}	
}

class TestDefence{
	
	public static void main(String[]args) {
		
		army a1 = new army("Rasu",48000,"India","New Delhi", 6200,15,500,4600, 25000,75000, 270);
                a1.display();
		Navy n1 = new Navy("Vani",300,"India","New Delhi",950,12,150,150,16,500);
		n1.display();
	}
}