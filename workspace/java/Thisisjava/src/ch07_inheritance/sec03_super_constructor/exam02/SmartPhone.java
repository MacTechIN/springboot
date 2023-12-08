package ch07_inheritance.sec03_super_constructor.exam02;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color); // 부모 생성자 호출
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}