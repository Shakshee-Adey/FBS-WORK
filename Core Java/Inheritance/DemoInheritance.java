

class Student {
   int fbId;
   String name;
   int distance;
   static int count=0;
   
   //default 
   Student() {
	   System.out.println("Student Default constructor ");
	   fbId=101;
	   name="not given";
	   distance=10;
	   count++;
   }
   // parametrized
   Student(int fbId, String name, int distance) {
	   System.out.println("Student Parameterized constructor ");
	   this.fbId=fbId;
	   this.name=name;
	   this.distance=distance;
	   count++;
   }
   
   //setter and getter
   int getFbId() {
	return fbId;
   }
   void setFbId(int fbId) {
	this.fbId = fbId;
   }
   String getName() {
	return name;
   }
   void setName(String name) {
	this.name = name;
   }
   int getDistance() {
	return distance;
   }
   void setDistance(int distance) {
	this.distance = distance;
   }
   static int getCount() {
	return count;
   }
   static void setCount(int count) {
	Student.count = count;
   }
   //display function
   void display()
   {
	 System.out.println("Firstbit id is : "+this.fbId);
	 System.out.println("Name is : "+this.name);
	 System.out.println("Distance travelled : "+this.distance);
   }
}//student class end here
class PlacedStudent extends Student
{
	//int fbId; remove the 3 variable
	//String name;
	//int distance;
	String companyName;
	String designation;
	
	//default 
	PlacedStudent() {
		super();  //step 4 a
		System.out.println("PlacedStudent default constructor ");
		   //fbId=101;
		   //name="not given";
		   //distance=10;
		   
		   companyName="Xyz";
		   designation="Pqr";
	   }
	   // parametrized
	PlacedStudent(int fbId, String name, int distance, String companyName, String designation) {
		super(fbId,name,distance);  //step 4 b
		System.out.println("PlacedStudent Parameterized constructor ");
		   //this.fbId=fbId;
		   //this.name=name;
		   //this.distance=distance;
		   this.companyName=companyName;
		   this.designation=designation;
	   }
	   
    // int getFbId() {return fbId;}
    //void setFbId(int fbId) {this.fbId = fbId;}
	//String getName() {return name;}
	//void setName(String name) {this.name = name;}
	//int getDistance() {return distance;}
	//void setDistance(int distance) {this.distance = distance;}
	String getCompanyName() {
		return companyName;
	}
	void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	String getDesignation() {
		return designation;
	}
	void setDesignation(String designation) {
		this.designation = designation;
	}
	
	void display()
	   {
		// System.out.println("Firstbit id is : "+this.fbId);
		 //System.out.println("Name is : "+this.name);
		// System.out.println("Distance travelled : "+this.distance);
		super.display();
		 System.out.println("Company Name is : "+this.companyName);
		 System.out.println("Designation is : "+this.designation);
	   }
}//placedStudent end here
class DemoInheritance
{
  public static void main(String[]args)
  {
	//Student s1= new Student();
	//System.out.println("Student count total " + Student.getCount());
  
	//Student s2= new Student(102,"Shakshee",100);
	//System.out.println("Student count total " + Student.getCount());
	PlacedStudent ps2= new PlacedStudent();
	ps2.display();
	System.out.println(ps2.getName());
	System.out.println("\n");
	PlacedStudent ps1= new PlacedStudent(103,"Prachi",200,"BCCI","Coach");
	System.out.println("Student count total " + Student.getCount());
	ps1.display(); 
	System.out.println(ps1.getName());
  }
}