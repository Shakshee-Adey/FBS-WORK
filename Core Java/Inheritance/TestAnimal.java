class Animal {
	String name;
    int age;
    String color;
    static int count=0;
  
       // Default constructor
    Animal() {
        System.out.println("Animal default constructor");
        name = "Unknown";
        age = 0;
        color = "dont no";
    }

    // Parameterized constructor
    Animal(String name, int age, String color) {
    	System.out.println("Animal para constructor");
        this.name = name;
        this.age = age;
        this.color = color;
    }

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
	static int getCount() {
		 return count;
	   }
       static void setCount(int count) {
		   Animal.count = count;
	   }

	void display() {
       System.out.println("name is : " + name);
       System.out.println("Age is : " + age);
       System.out.println("Color is : " + color);
   }
 }
class Dog extends Animal
{
	String breed;
	
	// Default constructor
    Dog() {
    	super();
        System.out.println("Dog default constructor");
        breed = "barking";
    }

    // Parameterized constructor
    Dog(String name, int age, String color,String breed) {
    	super(name,age,color);
        System.out.println("Dog para constructor");
        this.breed =breed;
        
    }

	String getBreed() {
		return breed;
	}

	void setBreed(String breed) {
		this.breed = breed;
	}
	void display()
	{
		super.display();
		System.out.println("breed is : "+ breed);
	}
}
class Cow extends Animal
{
	double milkProduction;
	
	// Default constructor
    Cow() {
    	super();
        System.out.println("Cow default constructor");
        milkProduction = 300;
    }

    // Parameterized constructor
    Cow(String name, int age, String color,double milkProduction) {
    	super(name,age,color);
        System.out.println("Cow para constructor");
        this.milkProduction =milkProduction;
        
    }

	double getMilkProduction() {
		return milkProduction;
	}

	void setMilkProduction(double milkProduction) {
		this.milkProduction = milkProduction;
	}
	void display()
	{
		super.display();
		System.out.println("milkp is : "+milkProduction );
	}
}
class TestAnimal
{
	public static void main(String[] args) {

		Dog l1 = new Dog();
		l1.display();
		
		Cow c1 = new Cow();
		c1.display();
		System.out.println("\nTotal Device: " + Animal.getCount());
	}
}