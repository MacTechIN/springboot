package ch07_inheritance.sec03_super_constructor.exam01;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		// 명시적으로 호출하지 않아도 부모 생성자가 호출된다.
		super(); // 명시적으로 부모 생성자 호출 : 가장 먼저 기술
		this.model = model;
		this.color = color;
		// java: Constructor call must be the first statement in a constructor
		// super();
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}