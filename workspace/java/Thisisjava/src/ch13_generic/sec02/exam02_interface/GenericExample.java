package ch13_generic.sec02.exam02_interface;

public class GenericExample {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();

		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}
}