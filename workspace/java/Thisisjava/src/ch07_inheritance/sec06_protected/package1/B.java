package ch07_inheritance.sec06_protected.package1;

/*
 * 같은 패키지에 있는 클래스 A의 protected 접근 가능
 */
public class B {
	//메소드 선언
	public void method() {
		A a = new A();		//o
		a.field = "value"; 	//o
		a.method(); 			//o
	}
}