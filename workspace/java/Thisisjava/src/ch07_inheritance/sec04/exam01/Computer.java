package ch07_inheritance.sec04.exam01;

public class Computer extends Calculator {
	// 메소드 오버라이딩 : 재정의
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

	// overloading
	public double areaCircle(double r, int x) {
		System.out.printf("Computer 객체의 areaCircle(%f, %d) 실행\n", r, x);
		return Math.PI * r * r + x;
	}
}