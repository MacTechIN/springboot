package ch02.sec11_variable_scope;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;

		// 블록안에서 선언된 변수는 블록을 벗어나면 사라짐
		// 변수 v2는 if() { ... } 블록에서만 유효한 변수
		if(v1 > 10) {
			int v2 = v1 - 10;
		}

		// v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
		// int v3 = v1 + v2 + 5;
	}
}