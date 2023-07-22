
public class Car {
	String make;
    String model;
    String color;
    int year;
    String fuelType;
    int numberOfDoors;
    boolean isAutomatic;
    double mileage;
    boolean isEngineRunning;
    double currentSpeed;
	public Car(String make, String model, String color, int year, String fuelType, int numberOfDoors,
			boolean isAutomatic, double mileage, boolean isEngineRunning, double currentSpeed) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.fuelType = fuelType;
		this.numberOfDoors = numberOfDoors;
		this.isAutomatic = isAutomatic;
		this.mileage = mileage;
		this.isEngineRunning = isEngineRunning;
		this.currentSpeed = currentSpeed;
	}
		
	void mileage() {
		System.out.println(make+" car which is in "+color+" color gives good mileage");
		
	}
	void transport() {
		System.out.println(model+" car of "+fuelType+" fueltype provides effective transportation to public");
	
	}

}
