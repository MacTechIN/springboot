package ch07_inheritance.sec11_sealed;

// 봉인된 클래스
// Java 15부터 지원
// 상속제한
public sealed class Person permits Employee, Manager {
	//필드
	public String name;

	//메소드
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}