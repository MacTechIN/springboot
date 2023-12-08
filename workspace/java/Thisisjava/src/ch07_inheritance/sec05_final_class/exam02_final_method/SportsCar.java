package ch07_inheritance.sec05_final_class.exam02_final_method;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
	}

	// 부모 메소드가 final로 정의되어 있으므로
	// 오버라이딩을 할 수 없음
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
}