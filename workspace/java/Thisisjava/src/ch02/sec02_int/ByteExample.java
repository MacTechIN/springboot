package ch02.sec02_int;

public class ByteExample {
	public static void main(String[] args) {
		System.out.println("[바이트] 1바이트");
		System.out.printf("최소: %d\n", Byte.MIN_VALUE); // -128
		System.out.printf("최소: %d\n", Byte.MAX_VALUE); // 127

		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);

		// 컴파일 에러(Type mismatch: cannot convert from int byte)
		// 자바의 정수처리의 기본 타입은 int
		// 128은 int로 처리
		// byte var6 = 128;
		byte var6 = (byte)128;
		System.out.println("var6:" + var6); // -128
	}
}