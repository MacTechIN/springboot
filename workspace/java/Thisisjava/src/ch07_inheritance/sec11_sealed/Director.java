package ch07_inheritance.sec11_sealed;

public class Director extends Manager {
	@Override
	public void work() {
		System.out.println("제품을 기획합니다.");
	}
}