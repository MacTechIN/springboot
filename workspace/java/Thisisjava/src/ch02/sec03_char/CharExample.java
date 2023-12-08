package ch02.sec03_char;

public class CharExample {
	public static void main(String[] args) {
		// 문자는 작음 따옴표로 감싼다.
		// 정수값을 지정하면 유니코드에 해당하는 문자로 저장
		char c1 = 'A';          // 문자 저장
		char c2 = 65;          	// 유니코드 직접 저장
		
		char c3 = '가';        	// 문자 저장
		char c4 = 44032;      	// 유니코드 직접 저장
				
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
} 