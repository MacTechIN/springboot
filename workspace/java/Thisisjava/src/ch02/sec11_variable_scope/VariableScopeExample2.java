package ch02.sec11_variable_scope;

public class VariableScopeExample2 {
	public static void main(String[] args) {
		int v1 = 15;
		int v2 = 0;

		if(v1 > 10) {
			v2 = v1 - 10;
		}

		int v3 = v1 + v2 + 5;

		System.out.println("v2:" + v2); // 5
		System.out.println("v3:" + v3); // 25
	}
}