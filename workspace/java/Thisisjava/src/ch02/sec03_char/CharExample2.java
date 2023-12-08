package ch02.sec03_char;

public class CharExample2 {
	public static void main(String[] args) {
		// 문자는 작음 따옴표로 감싼다.
		// 정수값을 지정하면 유니코드에 해당하는 문자로 저장

		// 빈 문자 처리는 불가능
		// char cx = '';        // 문자 저장
		char cx = 0;
		char c1 = ' ';         	// 공백(space)문자 : 32
		char c2 = 32;

		System.out.printf("cx: [%c][%d]\n", cx, (int)cx);
		System.out.printf("c1: [%c][%d]\n", c1, (int)c1);
		System.out.printf("c2: [%c][%d]\n", c2, (int)c2);
		System.out.printf("cx[%d] == c1[%d] ? : [%b]\n", (int)cx, (int)c1, cx == c1); // false
		System.out.printf("c1[%d] == c2[%d] ? : [%b]\n", (int)c1, (int)c2, c1 == c2); // true


	}
} 