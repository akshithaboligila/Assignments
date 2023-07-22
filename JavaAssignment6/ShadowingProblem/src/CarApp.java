import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter make");
		String make = scan.next();
		
		System.out.println("Enter model");
		String model = scan.next();
		
		System.out.println("Enter color");
		String color = scan.next();
		
		System.out.println("Enter year");
		int year = scan.nextInt();
		
		System.out.println("Enter fuelType");
		String fuelType = scan.next();
		
		System.out.println("Enter nod");
		int numberOfDoors = scan.nextInt();
		
		System.out.println("Enter isAutomatic");
		boolean isAutomatic = scan.nextBoolean();
		
		System.out.println("Enter mileage");
		double mileage = scan.nextDouble();
		
		System.out.println("Enter isEngineRunning");
		boolean isEngineRunning = scan.nextBoolean();
		
		System.out.println("Enter currentSpeed");
		double currentSpeed = scan.nextDouble();
		
		Car c = new Car(make, model, color, year, fuelType, numberOfDoors, isAutomatic, mileage, isEngineRunning, currentSpeed);
		
		System.out.println(c.make+" "+c.model+" "+c.color+" "+c.year+" "+c.fuelType+" "+c.numberOfDoors+" "+c.isAutomatic+" "+c.mileage+" "+c.isEngineRunning+" "+c.currentSpeed);
		c.mileage();
		c.transport();
		
	}

}
