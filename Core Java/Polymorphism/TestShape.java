class Shape {
	int id;
	String name;
	double area;
	
	
	//default 
	   Shape() {
		   System.out.println("Shape Default constructor ");
		   id=101;
		   name="not given";
		   area=20;
		   
	   }
	   // parametrized
	   Shape(int id, String name, double area) {
		   System.out.println("Shape Parameterized constructor ");
		   this.id=id;
		   this.name=name;
		   this.area=area;
		   
	   }
	   int getId() {
		   return id;
	   }
	   void setId(int id) {
		   this.id = id;
	   }
	   String getName() {
		   return name;
	   }
	   void setName(String name) {
		   this.name = name;
	   }
	   double getArea() {
		   return area;
	   }
	   void setArea(double area) {
		   this.area = area;
	   }
	   
	 //display function
	   void display()
	   {
		 System.out.println("Shape id is : "+this.id);
		 System.out.println("Name is : "+this.name);
		 System.out.println("area is: "+this.area);
	   }
}//Shape class end here
class Triangle extends Shape
{
	
	double base;
	double hight;
	
	//default 
	   Triangle() {
		   super();
		   System.out.println("Shape Default constructor ");
		   base=12;
		   hight=10;
	   }
	   // parametrized
	  Triangle (int id, String name, double area,double base,double hight) {
		  super(id,name,area);
		   System.out.println("Shape Parameterized constructor ");
		   this.base=base;
		   this.hight=hight;
		   
	   }
	  double getBase() {
		  return base;
	  }
	  void setBase(double base) {
		  this.base = base;
	  }
	  double getHight() {
		  return hight;
	  }
	  void setHight(double hight) {
		  this.hight = hight;
	  }
	  
	  void display()
	   {
                 super.display();
		 System.out.println("Base is : "+this.base);
		 System.out.println("Hight is : "+this.hight);
	   }
	
}// triangle end here
class Rectangle extends Shape
{
	double length;
	double breadth;
	
	//default 
	   Rectangle() {
		   super();
		   System.out.println("Shape Default constructor ");
		   length=11;
		   breadth=9;
	   }
	   // parametrized
	  Rectangle(int id, String name, double area,double length,double breadth) {
		  super(id,name,area);
		   System.out.println("Shape Parameterized constructor ");
		   this.length=length;
		   this.breadth=breadth;
		   
	   }
	  double getLength() {
		  return length;
	  }
	  void setLength(double length) {
		  this.length = length;
	  }
	  double getBreadth() {
		  return breadth;
	  }
	  void setBreadth(double breadth) {
		  this.breadth = breadth;
	  }
	  void display()
	   {
                 super.display();
		 System.out.println("Length is : "+this.length);
		 System.out.println("Breadth is : "+this.breadth);
	   }
	
}//rectangle end here

class Circle extends Shape
{
	double radius;
	
	//default 
	   Circle() {
		   super();
		   System.out.println("Shape Default constructor ");
		   radius=16;
	   }
	   // parametrized
	  Circle(int id, String name, double area,double radius) {
		  super(id,name,area);
		   System.out.println("Shape Parameterized constructor ");
		   this.radius=radius;
		}
	  double getRadius() {
		  return radius;
	  }
	  void setRadius(double radius) {
		  this.radius = radius;
	  }
	  void display()
	   {
                 super.display();
		 System.out.println("Radius is : "+this.radius);
	   }
}// circle is end here
class TestShape
{
	public static void main(String[] args) {

                Shape s1 = new Shape(100, "Shakshee",15);
		s1.display();
                System.out.println("\n");

		s1 = new Triangle(111,"Roop",11,19,20);
		s1.display();
		System.out.println("\n");

		s1 = new Rectangle(222,"Prachi",50,12,4);
		s1.display();
		System.out.println("\n");
		
		s1 = new Circle(333,"Vani",30, 8);
		s1.display();

	
	}
}
