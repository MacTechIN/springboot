package ch06_class.sec13_access.exam01.package2;
	
import ch06_class.sec13_access.exam01.package1.*;
	
public class C {
	public static void main(String[] args) {
		// A 클래스는 default 접근 제한을 가지고 있기 때문에 다른 패키지에서 접근 불가
		// java: The type A is not visible
		// A a = new A();  // x
		// System.out.println(a);

		B b = new B();   //o
		System.out.println(b);
	}
}