package ch07_inheritance.sec07_type_casting.exam02;

public class ChildExample {
	public static void main(String[] args) {
		//자식 객체 생성
		Child child = new Child();

		//자동 타입 변환
		Parent parent = child;

		// 메소드 호출 : 상속 받은 그대로 사용
		parent.method1(); // Parent-method1()

		// 자식 클래스에서 재정한 메소드가 호출
		parent.method2(); // Child-method2()

		// undefined : 부모 클래스에 정의되어 있지 않으므로 사용할 수 없다.
		// parent.method3(); // (호출 불가능)
	}
}