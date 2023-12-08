package ch06_class.sec13_access.exam02.package2;

import ch06_class.sec13_access.exam02.package1.*;
	
public class C {
	//필드 선언
	A a1 = new A(true); 	//o
	
	// default 접근 제한 : 다른 패키지
	//A a2 = new A(1); 		//x
	//A a3 = new A("문자열"); 	//x
}