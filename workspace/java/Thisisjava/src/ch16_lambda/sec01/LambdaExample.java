package ch16_lambda.sec01;

public class LambdaExample {
	public static void main(String[] args) {
		Calculable calc1 = new Calculable() { // 익명 구현 클래스
			@Override
			public void calculate(int x, int y) {
				int result = x / y;
				System.out.println("result: " + result);
			}
		};
		calc1.calculate(10, 5);

		Calculable calc2 = (x,y) -> { // 람다식
			int result = x / y;
			System.out.println("result: " + result);
		};
		calc2.calculate(10, 4);

		action(new Calculable() { // 익명 구현 클래스로 객체를 생성해서 함수(action)에 전달
			@Override
			public void calculate(int x, int y) {
				int result = x * y;
				System.out.println("result: " + result);
			}
		});

		action((x, y) -> { // 람다식 객체를 생성해서 함수(action)에 전달
			int result = x + y;
			System.out.println("result: " + result);
		});

		action((x, y) -> { // 람다식 객체를 생성해서 함수(action)에 전달
			int result = x - y;
			System.out.println("result: " + result);
		});
	}

	public static void action(Calculable calculable) {
		//데이터
		int x = 10;
		int y = 4;
		//데이터 처리
		calculable.calculate(x, y);
	}
}