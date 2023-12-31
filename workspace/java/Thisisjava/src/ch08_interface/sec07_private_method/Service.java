package ch08_interface.sec07_private_method;

public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon(); // private method 호출
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();  // private method 호출
	}

	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드A");
		System.out.println("defaultMethod 중복 코드B");
	}

	//정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon(); // private static 메소드 호출
	}

	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon(); // private static 메소드 호출
	}

	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
}