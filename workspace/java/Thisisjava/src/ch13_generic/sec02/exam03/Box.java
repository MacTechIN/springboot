package ch13_generic.sec02.exam03;

public class Box<T> {
	public T content;

	public Box() {}

	public Box(T content) {
		this.content = content;
	}

	//Box의 내용물이 같은지 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		return result;
	}

}