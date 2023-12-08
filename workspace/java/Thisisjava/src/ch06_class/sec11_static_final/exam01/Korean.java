package ch06_class.sec11_static_final.exam01;

public class Korean {
	//인스턴스 final 필드 선언
	final String nation = "대한민국";
	final String ssn;
	
	//인스턴스 필드 선언
	String name;

	//생성자 선언
	public Korean(String ssn, String name) {
		// 선언할 때 초기값으로 지정된 final 변수는 다시 초기화 할 수 없다.
		// this.nation = "미국";

		this.ssn = ssn;
		this.name = name;
	}

	/*
	 * final로 선언된 변수는 메소드에서는 변경 불가
	 */
	void makeInfo() {
		// this.nation = "미국";
		// this.ssn = ssn;
	}
}