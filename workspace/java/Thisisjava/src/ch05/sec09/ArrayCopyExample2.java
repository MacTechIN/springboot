package ch05.sec09;

public class ArrayCopyExample2 {
	public static void main(String[] args) {
		//길이 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		//길이 5인 배열을 새로 생성
		String[] newStrArray = new String[2];
		//배열 항목 복사
		int len = (oldStrArray.length > newStrArray.length) ?  newStrArray.length : oldStrArray.length;
		System.out.println("len: " + len);
		System.arraycopy( oldStrArray, 0, newStrArray, 0, len);
		//배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}