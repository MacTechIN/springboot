package ch06_class.sec10_static.exam03;

public class Car {
	// 인스턴스 필드 선언
	int speed;

	// 인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}

	/*
	 * static member method에서는 인스턴스 멤버 사용 불가
	 */
	static void info() {
		// Cannot make a static reference to the non-static field speed
		System.out.println("info() : " + /* speed + */ "으로 달립니다.");
	}

	static void info(Car car) {
		System.out.println("info(Car):" + car.speed + "으로 달립니다.");
	}

	static void simulate() {
		//객체 생성
		Car myCar = new Car();

		// static method 호출
		// myCar.info();
		Car.info();
		Car.info(myCar);

		//인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}

	public static void main(String[] args) {
		Car.info();

		//정적 메소드 호출
		simulate();
		
		//객체 생성
		Car myCar = new Car();
		//인스턴스 멤버 사용
		myCar.speed = 60;
		myCar.run();
	}
}