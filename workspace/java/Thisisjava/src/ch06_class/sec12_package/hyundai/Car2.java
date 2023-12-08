package ch06_class.sec12_package.hyundai;

// import 문으로 다른 패키지의 모든 클래스를 임포트
import ch06_class.sec12_package.hankook.*;
import ch06_class.sec12_package.kumho.*;

public class Car2 {
	public static void main(String[] args) {
		// 부품 필드 선언
		// hankook의 Tire 클래스와 kumho의 Tire가 충돌하여 풀패키지 이름을 지정
		ch06_class.sec12_package.hankook.Tire tire1 = new ch06_class.sec12_package.hankook.Tire();
		ch06_class.sec12_package.kumho.Tire tire2 = new ch06_class.sec12_package.kumho.Tire();
		SnowTire tire3 = new SnowTire();
		AllSeasonTire tire4 = new AllSeasonTire();
	}
}