package ch16_lambda.sec01;

public class LambdaExample1 {
	public static void main(String[] args) {
		class Calc implements Calculable {
			@Override
			public void calculate(int x, int y) {
				int result = x / y;
				System.out.println("result: " + result);
			}
		}

		Calculable calc = new Calc();
		calc.calculate(10, 5);
	}

}