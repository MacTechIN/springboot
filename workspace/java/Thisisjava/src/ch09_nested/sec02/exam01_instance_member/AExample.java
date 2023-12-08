package ch09_nested.sec02.exam01_instance_member;

public class AExample {
	public static void main(String[] args) {
		//A 객체 생성
		A a = new A();
		a.method();

		// B 객체 생성
		// A 클래스의 객체를 통해서만
		// B 클래스를 객체화 할 수 있다.
		A.B b = a.new B();
		b.methodB();
	}
}