package ch02.sec09_operation_promotion;

public class StringConcatExample {
	public static void main(String[] args) {
		// 숫자 연산 : 컴파일 단계에서 연산을 수행
		int result1 = 10 + 2 + 8;
		System.out.println("result1: " + result1);

		// 결합 연산 : 문자열과 다른 자료형의 연산
		// 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열을 변환되어
		// 문자열 결합 연산을 수행
		String result2 = 10 + 2 + "8";   // 10 + 2 -> 12, 12가 문자열로 변환 "12" + "8" -> "128"
		System.out.println("result2: " + result2); // "128"

		String result3 = 10 + "2" + 8;
		System.out.println("result3: " + result3); // "1028"

		String result4 = "10" + 2 + 8;
		System.out.println("result4: " + result4); // "1028"

		String result5 = "10" + (2 + 8); // 괄호안에 산술연산이 수행된 10을 문자열로 변환하여 문자열 "10"과 결합
		System.out.println("result5: " + result5); // "1010"

		// java: Cannot cast from java.lang.String to int
		// int result5i = (int)result5;
		// System.out.println("result5i: " + result5i);

	}
}