package ch07_inheritance.sec04.exam02_super_method;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();

		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();

		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();

		sa.land();
	}
}