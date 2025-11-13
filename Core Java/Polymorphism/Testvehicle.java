class vehicle {
	
	    int speed;
	    int fuelCapacity;
	    String color;
	    String model;

	    // Default Constructor
	    vehicle() {
	        System.out.println("Vehicle Default Constructor");
	        this.speed = 40;
	        this.fuelCapacity = 50;
	        this.color = "Red";
	        this.model = "Generic Model";
	    }

	    // Parameterized Constructor
	    vehicle(int speed, int fuelCapacity, String color, String model) {
	        System.out.println("Vehicle Parameterized Constructor");
	        this.speed = speed;
	        this.fuelCapacity = fuelCapacity;
	        this.color = color;
	        this.model = model;
	    }

	    // Setters
	    void setSpeed(int speed) 
	    { 
	    this.speed = speed; 
	    }
	    
	    void setFuelCapacity(int fuelCapacity) 
	    { 
	    this.fuelCapacity = fuelCapacity; 
	    }
	    
	    void setColor(String color) 
	    { 
	    this.color = color; 
	    }
	    void setModel(String model) 
	    { 
	    this.model = model; 
	    }

	    // Getters
	    int getSpeed() 
	    { 
	    	return speed; 
	    	}
	    int getFuelCapacity() 
	    { 
	    	return fuelCapacity; 
	    	}
	    
	    String getColor() 
	    { 
	    	return color; 
	    	}
	    String getModel() 
	    { 
	    	return model; 
	    	}
	    

	    // Display
	    void display() {
	        System.out.println("Speed: " + this.speed);
	        System.out.println("Fuel Capacity: " + this.fuelCapacity);
	        System.out.println("Color: " + this.color);
	        System.out.println("Model: " + this.model);
	    }
	}



	class Bike extends vehicle {

	    int mileage;
	    String type;

	    // Default Constructor
	    Bike() {
	        super();
	        System.out.println("Bike Default Constructor");
	        this.mileage = 50;
	        this.type = "Sports";
	    }

	    // Parameterized Constructor
	    Bike(int speed, int fuelCapacity, String color, String model,int mileage, String type) {

	        super(speed, fuelCapacity, color, model);
	        System.out.println("Bike Parameterized Constructor");

	        this.mileage = mileage;
	        this.type = type;
	    }

	    // Setters
	    void setMileage(int mileage) 
	    { 
	    	this.mileage = mileage; 
	    	}
	    
	    void setType(String type) 
	    { 
	    	this.type = type; 
	    	}
	    

	    // Getters
	    int getMileage() 
	    { 
	    	return mileage; 
	    	}
	    
	    String getType() 
	    { 
	    	return type; 
	    	}

	    // Display
	    void display() 
	    {
	        super.display();
	        System.out.println("Mileage: " + this.mileage);
	        System.out.println("Type: " + this.type);
	    }
	}



	class Car extends vehicle {

	    int seatingCapacity;
	    String transmission;

	    // Default Constructor
	    Car() {
	        super();
	        System.out.println("Car Default Constructor");
	        this.seatingCapacity = 5;
	        this.transmission = "Automatic";
	    }

	    // Parameterized Constructor
	    Car(int speed, int fuelCapacity, String color, String model,int seatingCapacity, String transmission) {

	        super(speed, fuelCapacity, color, model);
	        System.out.println("Car Parameterized Constructor");

	        this.seatingCapacity = seatingCapacity;
	        this.transmission = transmission;
	    }

	    // Setters
	    void setSeatingCapacity(int seatingCapacity)
          { 
	    	this.seatingCapacity = seatingCapacity; 
	    	}
	    void setTransmission(String transmission) 
	    { 
	    	this.transmission = transmission; 
	    	}

	    // Getters
	    int getSeatingCapacity() 
	    { 
	    	return seatingCapacity; 
	    	}
	    String getTransmission() 
	    { 
	    	return transmission; 
	    	}

	    // Display
	    void display() {
	        super.display();
	        System.out.println("Seating Capacity: " + this.seatingCapacity);
	        System.out.println("Transmission: " + this.transmission);
	    }
	}



	class Testvehicle {
	    public static void main(String[] args) {
              
	        vehicle v1 = new vehicle(30,60,"green","All");
	        v1.display();

	        v1 = new Bike(90,10,"blue","Sports",12,"xy");
	        v1.display();

	        v1 = new Car(100,60,"red","All",5,"abc");
	        v1.display();
	    }
	}