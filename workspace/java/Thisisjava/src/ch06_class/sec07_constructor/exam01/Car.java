package ch06_class.sec07_constructor.exam01;

public class Car {
	// 생성자 선언
	Car() {
		System.out.println("기본 생성자");
	}

	Car(String model) {
		System.out.printf("생성자: 파라미터 1개 : %s\n", model );
	}

	/*
	 * 파라미터의 갯수가 동일하고 타입도 동일하면 오류 : Duplicate method
	Car(String color) {
		System.out.printf("생성자: 파라미터 1개 : %s\n", model );
	}
	*/

	Car(int speed) {
		System.out.printf("생성자: 스피드 파라미터 1개 : %s\n", speed );
	}

	Car(String model, String color, int maxSpeed) {
		System.out.printf("생성자: 파라미터 3개 : %s, %s, %d\n", model, color, maxSpeed );
	}
}