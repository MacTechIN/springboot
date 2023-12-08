package ch02.sec10_string2primitive;

/*
 * 포장클래스(Wrapper Class)를 이용하여 문자열을 기본형으로 변환
 */
public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		// String -> Primitive
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);

		// Primitive -> String
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);		
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

		// String Format
		String strfmt = String.format("strfmt:%d,%f,%b", value1, value2, value3);
		System.out.println(strfmt); // "strfmt:10,3.140000,true"
	}
}