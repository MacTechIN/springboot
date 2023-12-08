package ch06_class.sec07_constructor.exam03;

public class KoreanExample {
	public static void main(String[] args) {
		//Korean 객체 생성
		Korean k1 = new Korean("박자바", "011225-1234567");
		//Korean 객체 데이터 읽기
		System.out.println("k1.nation : " + k1.nation); // 대한민국
		System.out.println("k1.name : " + k1.name);     // null
		System.out.println("k1.ssn : " + k1.ssn);       // null
		System.out.println();
	}
}