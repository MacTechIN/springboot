package ch02.sec02_int;

public class LongExample {
	public static void main(String[] args) {
		System.out.println("[롱정수] 8바이트");
		System.out.printf("최소: %d\n", Long.MIN_VALUE); // -9223372036854775808
		System.out.printf("최소: %d\n", Long.MAX_VALUE); // 9223372036854775807
		long var1 = 10;  // int를 long 변환시켜서 할당(프로모션)
		long var2 = 20L; // L : 명시적으로 롱타입으로 할당

		// 컴파일러는 int로 간주하기 때문에 에러 발생
		// java: The literal 1000000000000 of type int is out of range
		// long var3 = 1000000000000;

		// 강제 변환(캐스팅)도 되지 않음
		// long var3 = (long)1000000000000;
		// System.out.println(var3);

		// int의 범위를 넘어서면 long 타입으로 지정해야 한다.
		long var4 = 1000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}