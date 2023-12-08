package ch02.sec11_variable_scope;

public class VariableScopeExample4 {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 7;

		// 로컬 변수는 2개 이상 선언이 불가능
		// 블록안에서 선언해도 동일하게 선언 불가
		if( v1 > v2 ) {
			// java: Duplicate local variable v2
			// int v2 = v1 - 10;
			System.out.println("[블록] v2= " + v2);
		}

		int v3 = v1 + v2 + 5;
		System.out.println("v2 = " + v2);
		System.out.println("v3 = " + v3);
	}
}