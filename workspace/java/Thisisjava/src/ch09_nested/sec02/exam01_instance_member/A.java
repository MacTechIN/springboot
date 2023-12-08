package ch09_nested.sec02.exam01_instance_member;

public class A {
	// 인스턴스 멤버 클래스
	// private로 접근 제한을 하면 밖에서는 접근할 수 없다.
	// private class B {}
	class B {
		B() {
			System.out.println("B() 생성자");
		}

		void methodB() {
			System.out.println("B.methodB() 메소드");
		}
	}
	
	//인스턴스 필드 값으로 B 객체 대입
	B field = new B(); 
	
	//생성자
	A() {
		System.out.println("A() 생성자");
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		System.out.println("A.method() 호출");
		B b = new B();
	}
}