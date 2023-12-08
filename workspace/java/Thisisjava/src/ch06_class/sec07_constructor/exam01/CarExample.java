package ch06_class.sec07_constructor.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저", "검정", 250);
		Car myCar2 = new Car();  // 기본 생성자 호출 못함
		Car myCar3 = new Car("소나타");
		Car myCar4 = new Car(100);
	}
}