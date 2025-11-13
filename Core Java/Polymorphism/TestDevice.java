class Device {
    String brand;
    String model;
    double price;
    static int count = 0;

    // Default constructor
    Device() {
        System.out.println("Device default constructor");
        brand = "Unknown";
        model = "Dont know";
        price = 0;
    }

    // Parameterized constructor
    Device(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
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
		   Device.count = count;
	   }

	void display() {
        System.out.println("Brand is : " + brand);
        System.out.println("Model is : " + model);
        System.out.println("Price is : " + price);
    }
} // Device class end here
class Laptop extends Device
{
	int ramSize;       
    int storageSize;
    
 // Default constructor
    Laptop() {
    	super();
        System.out.println("Device default constructor");
        ramSize=32;       
        storageSize=128;
    }

    // Parameterized constructor
    Laptop(String brand, String model, double price,int ramSize,int storageSize) {
    	super(brand,model,price);
        System.out.println("Device para. constructor");
        this.ramSize = ramSize;
        this.storageSize = storageSize;
    }

	int getRamSize() {
		return ramSize;
	}

	void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	int getStorageSize() {
		return storageSize;
	}

	void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	void display() {
		super.display();
        System.out.println("ramSize is : " + ramSize);
        System.out.println("storageSize is : " + storageSize);
	}
}// Laptop class end here
class Mobile extends Device
{
	int cameraM;
    int batteryCapacity;
   
    // Default constructor
    Mobile() {
    	super();
        System.out.println("Device default constructor");
        cameraM=36;       
        batteryCapacity=100;
    }

    // Parameterized constructor
    Mobile(String brand, String model, double price,int cameraM,int batteryCapacity) {
    	super(brand,model,price);
        System.out.println("Device para. constructor");
        this.cameraM = cameraM;
        this.batteryCapacity = batteryCapacity;
    }

	int getCameraM() {
		return cameraM;
	}

	void setCameraM(int cameraM) {
		this.cameraM = cameraM;
	}

	int getBatteryCapacity() {
		return batteryCapacity;
	}

    void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
    void display() {
    	super.display();
        System.out.println("CameraM is : " + cameraM);
        System.out.println("batteryCapacity is : " + batteryCapacity);
	}
 }//Mobile class end here
class SmartWatch extends Device
{
	String displayType;
	int batteryCapacity;
	
	// Default constructor
    SmartWatch() {
    	super();
        System.out.println("Device default constructor");
        displayType="LCD";       
        batteryCapacity=100;
    }

    // Parameterized constructor
    SmartWatch(String brand, String model, double price,String displayType,int batteryCapacity) {
    	super(brand,model,price);
        System.out.println("Device para. constructor");
        this.displayType = displayType;
        this.batteryCapacity = batteryCapacity;
    }

	String getDisplayType() {
		return displayType;
	}

	void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	int getBatteryCapacity() {
		return batteryCapacity;
	}

	void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	void display() {
		super.display();
        System.out.println("displayType is : " + displayType);
        System.out.println("batteryCapacity is : " + batteryCapacity);
	}
}// SmartWatch end here
class TestDevice
{
   public static void main(String[] args) {

		Device d1 = new Device("any", "Pavilion", 640500);
		d1.display();
		System.out.println("\n");

		d1 = new Laptop("HP", "Pavilion", 65000, 16, 512);
		d1.display();
		System.out.println("\n");


		d1 = new Mobile("Samsung", "Galaxy S24", 85000, 108, 5000);
		d1.display();
		System.out.println("\n");
		
		
		d1 = new SmartWatch("Apple", "Watch", 45000, "AMOLED", 18);
		d1.display();
                System.out.println("\n");

		System.out.println("\nTotal Device: " + Device.getCount());
	}
}