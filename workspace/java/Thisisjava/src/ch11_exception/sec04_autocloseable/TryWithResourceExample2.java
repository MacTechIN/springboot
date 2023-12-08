package ch11_exception.sec04_autocloseable;

public class TryWithResourceExample2 {
	public static void main(String[] args) {
		MyResource res = new MyResource("A");

		try {
			String data = res.read2();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		finally {
			try {
				res.close();
			}
			catch(Exception e) {}
		}
	}
}