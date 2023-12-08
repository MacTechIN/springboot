package ch06_class.sec10_static.exam02;

public class TelevisionExample {
	public static void main(String[] args) {

		System.out.println(Television.info); // MyCompany-LCD

		Television.model = "OLED";

		System.out.println(Television.info); // MyCompany-LCD
		System.out.println(Television.model);
	}
}