package ch13_generic.sec03.exam01;

public class GenericExample {
	// 제네릭 메소드
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		// 제네릭 메소드 호출

		// 기본 타입을 제네릭으로 사용할 수 없다.
		// Box<int> boxi = boxing(10);

		// 참조형(객체형) 가능
		Box<int[]> boxa = boxing(new int[]{10,20,30});
		int[] intValues = boxa.get();
		for(int v : intValues) {
			System.out.printf("[%d]", v);
		}

		System.out.println();

		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);

		// 제네릭 메소드 호출
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}