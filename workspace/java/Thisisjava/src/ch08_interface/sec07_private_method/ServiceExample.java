package ch08_interface.sec07_private_method;

public class ServiceExample {
	public static void main(String[] args) {
		//인터페이스 변수 선언과 구현 객체 대입
		Service service = new ServiceImpl();

		//디폴트 메소드 호출
		service.defaultMethod1();
		System.out.println();
		service.defaultMethod2();
		System.out.println();

		//정적 메소드 호출
		Service.staticMethod1();
		System.out.println();
		Service.staticMethod2();
		System.out.println();

		// 인터페이스의 private static method는 외부에서 접근 할 수 없다.
		// Service is not visible
		// Service.staticCommon();
	}
}