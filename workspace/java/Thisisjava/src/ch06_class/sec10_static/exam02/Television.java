package ch06_class.sec10_static.exam02;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	// static String info = company + "-" + model;;

	static { // 초기화 작업 : 최초에 한 번만 클래스가 로딩 될 때 실행
		info = company + "-" + model;
	}
}