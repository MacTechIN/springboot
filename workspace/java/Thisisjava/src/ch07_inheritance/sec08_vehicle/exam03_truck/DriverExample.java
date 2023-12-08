package ch07_inheritance.sec08_vehicle.exam03_truck;

public class DriverExample {
	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();

		drive(driver, new Taxi());
		drive(driver, new Bus());
		drive(driver, new Truck());
	}

	static void drive(Driver driver, Vehicle vehicle) {
		driver.drive(vehicle);
	}
}