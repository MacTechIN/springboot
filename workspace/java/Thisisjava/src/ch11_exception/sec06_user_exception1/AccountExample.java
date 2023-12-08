package ch11_exception.sec06_user_exception1;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());

		//출금하기
		try {
			account.withdraw(30000);
		} catch(InsufficientException e) {
			int errcode = e.errcode();
			String message = e.getMessage();
			System.out.printf("[예외발생] 오류코드:%d, 메시지:%s\n", errcode, message);
		}
	}
}