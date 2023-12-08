package ch02.sec06_string;

public class TextBlockExample {
	public static void main(String[] args) {

		// 문자열 더하기(+)는 문자열 붙이기
		String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";

		// Java 13부터 지원: 텍스트 블록
		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
		""";

		System.out.println(str1);
		System.out.println("------------------------------------");
		System.out.println(str2);
		System.out.println("------------------------------------");

		// Java 14부터 지원: 문자열 연결(\)
		String str = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";
		System.out.println(str);
	}
}