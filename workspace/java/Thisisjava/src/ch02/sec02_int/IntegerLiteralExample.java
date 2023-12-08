/*
 * 정수 : 4바이트: -2147483648 ~ 2147483647
 */
package ch02.sec02_int;

public class IntegerLiteralExample {
	public static void main(String[] args) {
		System.out.println("[정수] 4바이트");
		System.out.printf("최소: %d\n", Integer.MIN_VALUE); // -2147483648
		System.out.printf("최소: %d\n", Integer.MAX_VALUE); // 2147483647

		int var1 = 0b1011;  // 2진수: 0b, 0B
		int var2 = 0206;    // 8진수: 0
		int var3 = 365;     // 10진수
		int var4 = 0xB3;    // 16진수 : 0x, 0X

		// 10진수로 출력
		System.out.println("var1: " + var1); // 11
		System.out.println("var2: " + var2); // 128
		System.out.println("var3: " + var3); // 365
		System.out.println("var4: " + var4); // 179
	}
}