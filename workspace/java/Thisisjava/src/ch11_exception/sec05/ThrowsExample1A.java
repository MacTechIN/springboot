package ch11_exception.sec05;

public class ThrowsExample1A {
	public static void main(String[] args) throws ClassNotFoundException { // 예외처리를 java(JVM)에게 위임(떠 넘기기)
		// java: Unhandled exception type java.lang.ClassNotFoundException
		findClass();
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
}