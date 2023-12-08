package ch11_exception.sec02.exam01;

public class ExceptionHandlingExample1A {
	public static void printLength(String data) {
		int result = (data != null) ? data.length() : 0;
		System.out.println("문자 수: " + result);
	}

	public static void main(String[] args) {
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}