package ch06_class.sec04_class;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");

		Student s3 = s1;

		boolean tf = (s1 == s2);
		System.out.println("tf: " + tf);    // false
		System.out.println("s3 == s1 ? : " + (s3 == s1)); // true
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		System.out.println("s3:" + s3);

		System.out.printf("s1: %s/%x\n", s1, System.identityHashCode(s1));
	}
}