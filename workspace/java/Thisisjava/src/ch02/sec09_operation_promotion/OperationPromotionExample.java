package ch02.sec09_operation_promotion;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20; // 컴파일 단계에서 연산: 10 + 20은 미리계산 후 할당
		System.out.println("result1: " + result1);

		// 정수의 기본형은 int이므로 v1, v2를 int로 변환 후 연산을 수행 후 할당
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2; // int 타입으로 변환 후 연산
		System.out.println("result2: " + result2);

		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;

		// 가장 큰 자료형인 long으로 변환 후 연산을 수행 후
		// int로 할당할 때 오류 발생하므로
		// int로 할당하려면 강제로 int 캐스팅을 해야 한다.
		// java: Type mismatch: cannot convert from long to int
		int result3i = (int)(v3 + v4 + v5); // long 타입으로 변환 후 연산
		System.out.println("result3i: " + result3i);

		long result3 = v3 + v4 + v5; // long 타입으로 변환 후 연산
		System.out.println("result3: " + result3);
			
		char v6 = 'A'; // 65
		char v7 = 1;
		int result4 = v6 + v7; // int 타입으로 변환 후 연산 : 66 == 'B'
		System.out.println("result4: " + result4);
		System.out.println("result4: " + (char)result4);

		int v8 = 10;
		int result5 = v8 / 4; // 정수 연산의 결과는 정수
		System.out.println("result5: " + result5); // 2

		// 최종적으로 실수(float)로 받아도 정수연산을 수행 후에 받으므로
		// 소숫점 이하는 잘림
		float result5f = v8 / 4; // 정수 연산의 결과는 정수
		System.out.println("result5f: " + result5f); // 2.0

		// java: Type mismatch: cannot convert from double to float
		// float result5ff = v8 / 4.0; // 정수 연산의 결과는 정수

		// float로 받으면 할당 전 최종 결과가 float여야 한다.
		// 그러므로 4.0f로 연산을 수행하거나 (float) 형태로 캐스팅을 해야 한다.
		float result5f1 = v8 / 4.0f; // 정수 연산의 결과는 정수
		System.out.println("result5f1: " + result5f1); // 2.5

		double fx = 4.0;
		float result5f2 = v8 / (float)fx;
		System.out.println("result5f2: " + result5f2); // 2.5

		int v9 = 10;
		double result6 = v9 / 4.0; // double 타입으로 변환 후 연산
		System.out.println("result6: " + result6); // 2.5

		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10 / v11; // double 타입으로 변환 후 연산
		System.out.println("result7: " + result7);
	}
}