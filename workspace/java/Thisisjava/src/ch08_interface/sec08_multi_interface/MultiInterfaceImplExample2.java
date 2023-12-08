package ch08_interface.sec08_multi_interface;

public class MultiInterfaceImplExample2 {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.turnOff();
		stv.search("https://www.youtube.com");
	}
}