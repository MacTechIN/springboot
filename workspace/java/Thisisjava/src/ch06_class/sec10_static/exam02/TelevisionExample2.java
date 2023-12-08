package ch06_class.sec10_static.exam02;

public class TelevisionExample2 {
	public static void main(String[] args) {

		Television tv = new Television();

		System.out.println("1:" + Television.info); // MyCompany-LCD
		System.out.println("2:" + tv.info); // MyCompany-LCD

		Television.model = "OLED";
		tv.model = "QLED";

		System.out.println(Television.info); // MyCompany-LCD
		System.out.println(Television.model);
	}
}