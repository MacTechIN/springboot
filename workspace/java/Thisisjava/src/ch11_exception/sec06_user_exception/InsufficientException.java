package ch11_exception.sec06_user_exception;

public class InsufficientException extends Exception {
	public InsufficientException() {
	}

	public InsufficientException(String message) {
		super(message);
	}
}