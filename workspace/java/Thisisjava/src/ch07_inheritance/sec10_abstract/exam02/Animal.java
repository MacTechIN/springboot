package ch07_inheritance.sec10_abstract.exam02;

public abstract class Animal {
	//메소드 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// public void sound() {}

	// error
	// public void sound();

	// 추상 메소드 선언
	public abstract void sound();
}