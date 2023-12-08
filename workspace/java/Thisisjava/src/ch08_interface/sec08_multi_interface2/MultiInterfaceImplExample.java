package ch08_interface.sec08_multi_interface2;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevisionImpl();
		stv.turnOn();
		stv.turnOff();
		stv.search("https://www.youtube.com");
	}
}