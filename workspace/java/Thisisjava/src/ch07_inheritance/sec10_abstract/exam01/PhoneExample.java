package ch07_inheritance.sec10_abstract.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		// java: Cannot instantiate the type ch07_inheritance.sec10_abstract.exam01.Phone
		// Phone phone = new Phone();

		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}