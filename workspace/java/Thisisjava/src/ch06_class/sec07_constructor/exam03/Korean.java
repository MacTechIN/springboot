package ch06_class.sec07_constructor.exam03;

public class Korean {
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;

	// 생성자 선언
	public Korean(String name, String ssn) {
		System.out.printf("%s,%s\n", name, ssn);
		// 멤버 필드로 처리하여 인자로 전달 된 값을 할당하지 못함
		name = name;
		ssn = ssn;
	}
}