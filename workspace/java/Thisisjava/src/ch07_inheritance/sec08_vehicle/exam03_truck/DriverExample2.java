package ch07_inheritance.sec08_vehicle.exam03_truck;

public class DriverExample2 {
	public static void main(String[] args) {
		drive(new Driver(), new Taxi());
		drive(new Driver(), new Bus());
		drive(new Driver(), new Truck());
	}

	static void drive(Driver driver, Vehicle vehicle) {
		driver.drive(vehicle);
	}
}