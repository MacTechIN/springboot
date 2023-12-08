package ch06_class.sec15_singleton;

/*
 * 이 클래스로 만들 수 있는 객체는 유일하게 1개만 생성 되도록 통제
 *   - 생성자를 접근하지 못하도록 제한 : private
 *   - 객체에 접근할 수 있는 메소드를 하나만 열어 (통로) : getInstance()
 */
public class Singleton {
	public static void main(String[] args) {
		for(int x = 0; x < 10; x++) {
			// 동일한 클래스에서는 객체 생성 가능
			Singleton s = new Singleton();
			System.out.println("count:" + Singleton.count());
		}
	}
	private static int count = 0;
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();

	// private 접근 권한을 갖는 생성자 선언
	private Singleton() {
		Singleton.count++;
	}

	// public 접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		return singleton;
	}

	static public int count() {
		return Singleton.count;
	}
}