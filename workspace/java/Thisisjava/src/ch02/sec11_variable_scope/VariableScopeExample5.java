package ch02.sec11_variable_scope;

public class VariableScopeExample5 {
	int v2 = 10; // 멤버변수: 인스턴스 변수

	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 20; // 로컬변수 v2 선언 가능

		int v3 = v1 + v2 + 5; // 로컬변수 v2(20)을 사용
		System.out.println("v2 = " + v2);
		System.out.println("v3 = " + v3);
	}
}