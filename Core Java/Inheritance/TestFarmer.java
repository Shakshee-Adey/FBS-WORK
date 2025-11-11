class Farmer {
        int fid;
        String fname;
        String city;
        double income;
        int noOfEquipment;
        double insequenceAmt;
        double landArea;
        static int count=0;
        
      //default 
 	   Farmer() {
 		   System.out.println("Farmer Default constructor ");
 		    fid=101;
 		    fname="not given";
 		    city="dont know";
 	            income=100000;
 	            noOfEquipment=3;
 	            insequenceAmt=40000;
 	            landArea=6;
 		    count++;
 	   }
 	   // parametrized
 	   Farmer(int fid, String fname,String city,double income,int noOfEquipment,double insequenceAmt,double landArea) {
 		   System.out.println("Shape Parameterized constructor ");
 		   this.fid=fid;
 		   this.fname=fname;
 		   this.city=city;
 		   this.income=income;
	           this.noOfEquipment=noOfEquipment;
	           this.insequenceAmt=insequenceAmt;
	           this.landArea=landArea;
 		   count++;
 	        }
                 int getFid() {
			return fid;
		}
		void setFid(int fid) {
			this.fid = fid;
		}
		String getFname() {
			return fname;
		}
		void setFname(String fname) {
			this.fname = fname;
		}
	        String getCity() {
			return city;
		}
		void setCity(String city) {
			this.city = city;
		}
		double getIncome() {
			return income;
		}
		void setIncome(double income) {
			this.income = income;
		}
		int getNoOfEquipment() {
			return noOfEquipment;
		}
		void setNoOfEquipment(int noOfEquipment) {
			this.noOfEquipment = noOfEquipment;
		}
		double getInsequenceAmt() {
			return insequenceAmt;
		}
		void setInsequenceAmt(double insequenceAmt) {
			this.insequenceAmt = insequenceAmt;
		}
		double getLandArea() {
			return landArea;
		}
		void setLandArea(double landArea) {
			this.landArea = landArea;
		}
                static int getCount() {
		   return count;
	        }
	        static void setCount(int count) {
		   Farmer.count = count;
	        }
		
		//display function
		   void display()
		   {
			 System.out.println("fid id is : "+this.fid);
			 System.out.println("fName is : "+this.fname);
			 System.out.println("city is: "+this.city);
			 System.out.println("Income is : "+this.income);
			 System.out.println("noOfEquipment is : "+this.noOfEquipment);
			 System.out.println("insequenceAmt is: "+this.insequenceAmt);
			 System.out.println("landArea is : "+this.landArea);
			 
		   }
    } //farmer class end here
class DairyFarmer extends Farmer
{
	int dairyLicencesNo;
	int noOfCattles;
	double milkProduction;
	
	//default 
	   DairyFarmer() {
		   super();
		   System.out.println("DairyFarmer Default constructor ");
		   dairyLicencesNo=12345;
		   noOfCattles=100;
		   milkProduction=300;
	   }
	   
	   //parametrized 
	   DairyFarmer(int fid, String fname,String city,double income,int noOfEquipment,double insequenceAmt,double landArea,int dairyLicencesNo,int noOfCattles,double milkProduction) {
		   super(fid,fname,city,income,noOfEquipment,insequenceAmt,landArea);
		   System.out.println("DairyFarmer P constructor ");
		   this.dairyLicencesNo=dairyLicencesNo;
		   this.noOfCattles=noOfCattles;
		   this.milkProduction=milkProduction;
	   }

	   int getDairyLicencesNo() {
		   return dairyLicencesNo;
	   }

	   void setDairyLicencesNo(int dairyLicencesNo) {
		   this.dairyLicencesNo = dairyLicencesNo;
	   }

	   int getNoOfCattles() {
		   return noOfCattles;
	   }

	   void setNoOfCattles(int noOfCattles) {
		   this.noOfCattles = noOfCattles;
	   }

	   double getMilkProduction() {
		   return milkProduction;
	   }

	   void setMilkProduction(double milkProduction) {
		   this.milkProduction = milkProduction;
	   }
	 //display function
	   void display()
	   {
		 super.display();
		 System.out.println("dairyLicencesNo is : "+this.dairyLicencesNo);
		 System.out.println("noOfCattles is : "+this.noOfCattles);
		 System.out.println("milkProduction is: "+this.milkProduction);
	   }
}  //DairyFarmer class end here
class PoultryFarmer extends Farmer
{
	int numChickens;
	int eggProduction;
	int noOfShades;
	
	//default 
	PoultryFarmer() {
		   super();
		   System.out.println("PoultryFarmer Default constructor ");
		   numChickens=123;
		   eggProduction=500;
		   noOfShades=50;
	   }
	   
	   //parametrized 
	PoultryFarmer(int fid, String fname,String city,double income,int noOfEquipment,double insequenceAmt,double landArea,int numChickens,int eggProduction,int noOfShades) {
		   super(fid,fname,city,income,noOfEquipment,insequenceAmt,landArea);
		   System.out.println("PoultryFarmer P constructor ");
		   this.numChickens=numChickens;
		   this.eggProduction=eggProduction;
		   this.noOfShades=noOfShades;
	   }

	int getNumChickens() {
		return numChickens;
	}

	void setNumChickens(int numChickens) {
		this.numChickens = numChickens;
	}

	int getEggProduction() {
		return eggProduction;
	}

	void setEggProduction(int eggProduction) {
		this.eggProduction = eggProduction;
	}

	int getNoOfShades() {
		return noOfShades;
	}

	void setNoOfShades(int noOfShades) {
		this.noOfShades = noOfShades;
	}
	//display function
	   void display()
	   {
		 super.display();
		 System.out.println("numChickens is : "+this.numChickens);
		 System.out.println("eggProduction is : "+this.eggProduction);
		 System.out.println("noOfShades is: "+this.noOfShades);
	   }
}//PoultryFarmer class is end here
class OrganicFarmer extends Farmer
{
	int organicId;
	String fertilizerType;
	
	//default 
	OrganicFarmer() {
			   super();
			   System.out.println("OrganicFarmer Default constructor ");
			   organicId=101;
			   fertilizerType="compost";
		   }
		   
		   //parametrized 
	OrganicFarmer(int fid, String fname,String city,double income,int noOfEquipment,double insequenceAmt,double landArea,int organicId,String fertilizerType) {
			   super(fid,fname,city,income,noOfEquipment,insequenceAmt,landArea);
			   System.out.println("OrganicFarmer P constructor ");
			   this.organicId=organicId;
			   this.fertilizerType=fertilizerType;
		   }

	int getOrganicId() {
		return organicId;
	}

	void setOrganicId(int organicId) {
		this.organicId = organicId;
	}

	String getFertilizerType() {
		return fertilizerType;
	}

	void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}
	//display function
	   void display()
	   {
		 super.display();
		 System.out.println("organicId is : "+this.organicId);
		 System.out.println("fertilizerType is : "+this.fertilizerType);
	   }
} //OrganicFarmer class end here
class TestFarmer
{
	public static void main(String[] args) {

		DairyFarmer d1 = new DairyFarmer();
		d1.display();

		DairyFarmer d2 = new DairyFarmer(501,"Shakshee","Balaghat",1200000,7,15000,5.3,7890,19,150);
		d2.display();
		System.out.println("\n");

		PoultryFarmer p1 = new PoultryFarmer();
		p1.display();

		PoultryFarmer p2 = new PoultryFarmer(502,"vani","Shivni",95000,4,11000,6.7,300,380,5);
		p2.display();
		System.out.println("\n");
		
		OrganicFarmer o1 = new OrganicFarmer();
		o1.display();
		
		OrganicFarmer o2 = new OrganicFarmer(503,"Bharti","Chindwara",11900,2,11000,4.2,9087,"Yuriya");
		o2.display();

		System.out.println("\nTotal farmer: " + Farmer.getCount());
	}
}// TestFarmer class end here