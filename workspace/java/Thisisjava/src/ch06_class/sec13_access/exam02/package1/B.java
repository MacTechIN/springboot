package ch06_class.sec13_access.exam02.package1;

public class B {
	// 필드 선언
	A a1 = new A(true); 	//o
	A a2 = new A(1); 		//o

	// private으로 제한되어 있음
	// A a3 = new A("문자열");	//x
}