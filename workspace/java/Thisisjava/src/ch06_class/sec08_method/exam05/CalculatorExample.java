package ch06_class.sec08_method.exam05;

public class CalculatorExample {
	public static void main(String[] args) {
		// 객체 생성
		Calculator myCalcu = new Calculator();

		System.out.println("인자없이 호출:" + myCalcu.areaRectangle());

		System.out.println("생성자 지정: " + (new Calculator(30)).areaRectangle());

		// 정사각형의 넓이 구하기 : 정수
		int result1 = myCalcu.areaRectangle(10);

		// 정사각형의 넓이 구하기 : 실수
		double result2 = myCalcu.areaRectangle(10.0);

		System.out.println("정사각형 넓이=" + result1);
		System.out.println("정사각형 넓이=" + result2);
	}
}