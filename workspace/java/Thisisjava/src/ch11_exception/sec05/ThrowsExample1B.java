package ch11_exception.sec05;

public class ThrowsExample1B {
	public static void main(String[] args) {
		findClass();
	}

	public static void findClass() {
		try {
			Class.forName("java.lang.String2");
		}
		catch(ClassNotFoundException e) {}
	}
}