package ch02.sec12_printf;

public class PrintfExample {
	public static void main(String[] args) {
		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);   // 변수 크기에 맞게 출력
		System.out.printf("상품의 가격:%6d원\n", value);  // 오른쪽 정렬
		System.out.printf("상품의 가격:%-6d원\n", value); // 왼쪽 정렬
		System.out.printf("상품의 가격:%06d원\n", value); // 왼쪽 공백을 0을 채움

		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area); // 전체자릿수 지정, 남은 공간 공백처리

		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job); // 문자열 포맷
	}
}	