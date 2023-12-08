package ch16_lambda.sec01;

@FunctionalInterface
public interface Calculable {
	//추상 메소드
	void calculate(int x, int y);
}