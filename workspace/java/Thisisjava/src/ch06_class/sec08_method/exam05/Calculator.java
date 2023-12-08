package ch06_class.sec08_method.exam05;

public class Calculator {

	int _width;

	public Calculator() {}

	public Calculator(int width) {
		this._width = width;
	}

	int areaRectangle() {
		return _width * _width;
	}

	// 정사각형의 넓이
	int areaRectangle(int width) {
		System.out.println("[int] width=" + width);
		return width * width;
	}

	double areaRectangle(double width) {
		System.out.println("[double] width=" + width);
		return width * width;
	}
}
