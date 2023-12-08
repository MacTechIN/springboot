package ch06_class.sec09_this_method;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");

		myCar.run();
		yourCar.setSpeed(200);
		yourCar.run();
	}
}