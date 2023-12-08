package ch06_class.sec11_static_final.exam03_static_final;

public class Earth {
	// 상수 선언 및 초기화
	final static double EARTH_RADIUS = 6400;

	// final처럼 생성자에서 초기값을 지정 할 수 없다.
	// static final double EARTH_RADIUS;

	// 상수 선언
	static final double EARTH_SURFACE_AREA;
	
	// 정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}

}