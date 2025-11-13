class Furniture {
	int id;
	String name;
	double price;
	static int count = 0;

	// default constructor
	Furniture() {
		System.out.println("Furniture default constructor");
		id = 0;
		name = "Not Given";
		price = 100;
		count++;
	}

	// parameterized constructor
	Furniture(int id, String name, double price) {
		System.out.println("Furniture parameterized constructor");
		this.id = id;
		this.name = name;
		this.price = price;
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

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	static int getCount() {
		return count;
	}

	static void setCount(int count) {
		Furniture.count = count;
	}

	void display() {
		System.out.println("Furniture ID: " + this.id);
		System.out.println("Furniture Name: " + this.name);
		System.out.println("Price: " + this.price);
	}
}// class Furniture ends here


class Chair extends Furniture {
	String material;
	

	Chair() {
		super();
                System.out.println("Chair default constructor");
		material = "Wood";
		
		
	}

	Chair(int id, String name, double price, String material) {
		super(id, name, price);
                System.out.println("Chair parameterized constructor");
		this.material = material;
		
		
	}

	String getMaterial() {
		return material;
	}

	void setMaterial(String material) {
		this.material = material;
	}

	void display() {
		super.display();
		System.out.println("Material: " + this.material);
	}
}// class Chair ends here


class Table extends Furniture {
	String shape;
	int noOfLegs;

	Table() {
		super();
		shape = "Rectangle";
		noOfLegs = 4;
		System.out.println("Table default constructor");
	}

	Table(int id, String name, double price, String shape, int noOfLegs) {
		super(id, name, price);
		this.shape = shape;
		this.noOfLegs = noOfLegs;
		System.out.println("Table parameterized constructor");
	}
        String getShape() {
		return shape;
	}

	void setShape(String shape) {
		this.shape = shape;
	}

	int getNoOfLegs() {
		return noOfLegs;
	}

	void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	void display() {
		super.display();
		System.out.println("Shape: " + this.shape);
		System.out.println("No. of Legs: " + this.noOfLegs);
	}
}// class Table ends here


class Bed extends Furniture {
	String size;
	

	Bed() {
		super();
		size = "Queen";
		System.out.println("Bed default constructor");
	}

	Bed(int id, String name, double price, String size) {
		super(id, name, price);
		this.size = size;
		System.out.println("Bed parameterized constructor");
	}

	String getSize() {
		return size;
	}

	void setSize(String size) {
		this.size = size;
	}

	void display() {
		super.display();
		System.out.println("Size: " + this.size);
	}
}// class Bed ends here


class TestFurniture {
	public static void main(String[] args) {

                Furniture f1 = new Furniture(100, "All type", 1500);
		f1.display();
		System.out.println("\n");

		f1 = new Chair(101, "Office Chair", 4500, "Plastic");
		f1.display();
		System.out.println("\n");

                f1 = new Table(202, "Dining Table", 12000, "Round", 4);
		f1.display();
                System.out.println("\n");

		f1 = new Bed(303, "King Bed", 25000, "King");
		f1.display();
                System.out.println("\n");

		System.out.println("\nTotal Furniture: " + Furniture.getCount());
	}
}