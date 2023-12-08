/*
 * 문자열 : String 클래스
 * 1. 큰 따옴표로 감쌈("...")
 * 2. 기본 타입이 아니지만 기본 타입처럼 사용
 * 3. 기본 타입처럼 new를 하지 않고 사용할 수 있다.
 * 4. new를 사용해서 객체형으로 만들어 사용할 수 있다.
 */
package ch02.sec06_string;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		// 문자열 안에 큰 따옴표를 출력하기 위해서는
		// 역슬래시(\)를 넣으면 된다.
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업 ";    // Tab
		System.out.println(str);
		
		System.out.print("나는\n");   // 라인피드
		System.out.print("자바를\n"); // 라인피드
		System.out.print("배웁니다.");
	}
}