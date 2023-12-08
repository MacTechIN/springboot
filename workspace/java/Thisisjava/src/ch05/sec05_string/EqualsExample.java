package ch05.sec05_string;

public class EqualsExample {
	public static void main(String[] args) {
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";

		if(strVar1 == strVar2) { // 문자열 주소가 같은가?
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}

		if(strVar1.equals(strVar2)) { // 문자열의 값이 같은가?
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}

		// 힙 영역에 객체를 생성
		String strVar3 = new String("홍길동");
		String strVar4 = new String("홍길동");

		// new를 통해서 객체를 생성하면 다른 주소를 참조
		// 참조하는 주소가 같은가? false
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}

		// 참조하고 있는 데이터의 값이 같은가? true
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}
}