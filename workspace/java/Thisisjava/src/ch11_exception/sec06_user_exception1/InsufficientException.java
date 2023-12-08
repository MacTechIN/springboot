package ch11_exception.sec06_user_exception1;

public class InsufficientException extends Exception {

	private int errcode = 0;
	public InsufficientException() {
	}

	public InsufficientException(String message) {
		super(message);
	}

	public InsufficientException(int errcode, String message) {
		super(message);
		this.errcode = errcode;
	}

	public int errcode() {
		return this.errcode;
	}
}