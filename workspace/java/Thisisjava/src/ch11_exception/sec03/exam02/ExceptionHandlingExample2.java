package ch11_exception.sec03.exam02;

public class ExceptionHandlingExample2 {
	public static void main(String[] args) {
		String[] array = {"100", "1oo"};

		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch(Exception e) { // 모든 예외를 처리
				System.out.println("실행에 문제가 있습니다." + e.getMessage());
			}
			/*
			 * java: Unreachable catch block for java.lang.ArrayIndexOutOfBoundsException.
			 * It is already handled by the catch block for java.lang.Exception
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			}
			*/
		}
	}
}