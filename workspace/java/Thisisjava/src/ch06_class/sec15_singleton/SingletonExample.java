package ch06_class.sec15_singleton;

public class SingletonExample {
	public static void main(String[] args) {
		// java: The constructor ch06.sec15_singleton.Singleton() is not visible
 		// Singleton obj1 = new Singleton(); //컴파일 에러
 		// Singleton obj2 = new Singleton(); //컴파일 에러

		//정적 메소드를 호출해서 싱글톤 객체 얻음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println("count:" + Singleton.count());
		System.out.println("count:" + Singleton.count());

		//동일한 객체를 참조하는지 확인
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
	}
}