package ch11_exception.sec06_user_exception1;

public class Account {
	private long balance;
	
	public Account() { }

	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException(-1, "잔고 부족: "+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}