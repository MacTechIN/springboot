package ch02.sec07_promotion;

/*
 * 순서: byte(1Byte) < short(2Byte), char(2Byte) < int(4Byte) < long(8Byte) < float(8Byte) < double(8Byte)
 * 작은 타입에서 큰 타입으로 변환할 때
 * 명시적으로 강제 타입 변환을 하지 않아도 된다.
 */
public class PromotionExample {
	public static void main(String[] args) {
		// 자동 타입 변환 : promotion
		// 작은 타입에서 큰 타입으로 변환
		byte byteValue = 10;
		int intValue = byteValue;  // int <- byte
		intValue = intValue + byteValue;
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue;  // int <- char
		System.out.println("가의 유니코드: " + intValue);
			
		intValue = 50;
		long longValue = intValue; // long <- int
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue; // float <- long
		System.out.println("floatValue: " + floatValue);
			
		floatValue = 100.5F;
		double doubleValue = floatValue; // double <- float
		System.out.println("doubleValue: " + doubleValue);
	}
}			