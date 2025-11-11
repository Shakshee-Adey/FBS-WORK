class Shape {
	int id;
	String name;
	double area;
	static int count=0;
	
	//default 
	   Shape() {
		   System.out.println("Shape Default constructor ");
		   id=101;
		   name="not given";
		   area=20;
		   count++;
	   }
	   // parametrized
	   Shape(int id, String name, double area) {
		   System.out.println("Shape Parameterized constructor ");
		   this.id=id;
		   this.name=name;
		   this.area=area;
		   count++;
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
	   static int getCount() {
		   return count;
	   }
	   static void setCount(int count) {
		   Shape.count = count;
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

		Triangle t1 = new Triangle();
		t1.display();

		Triangle t2 = new Triangle(111, "Shakshee",15,19,20);
		t2.display();
		System.out.println("\n");

		Rectangle r1 = new Rectangle();
		r1.display();

		Rectangle r2 = new Rectangle(222, "Prachi", 50,12,4);
		r2.display();
		System.out.println("\n");
		
		Circle c1 = new Circle();
		c1.display();
		
		Circle c2 = new Circle(333, "Vani", 30, 8);
		c2.display();

		System.out.println("\nTotal shape: " + Shape.getCount());
	}
}
