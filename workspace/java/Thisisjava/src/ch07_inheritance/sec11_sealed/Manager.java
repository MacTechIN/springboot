package ch07_inheritance.sec11_sealed;

// 봉인 해제
public non-sealed class Manager extends Person {
	@Override
	public void work() {
		System.out.println("생산 관리를 합니다.");
	}
}