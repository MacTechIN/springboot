package ch02.sec08_type_casting;

public class CastingExample2 {
	public static void main(String[] args) {
		int var1 = 300;  // 0001 0010 1100

		byte var2 = (byte) var1;  // 0010 1100
		System.out.println(var2);  // 44

		float pi = 3.141592f;
		int npi = (int)pi;    // 소숫점 이하 잘리고 정수부만 남음
		System.out.println("pi: " + pi);   // 3.141592
		System.out.println("npi: " + npi); // 3
	}
}