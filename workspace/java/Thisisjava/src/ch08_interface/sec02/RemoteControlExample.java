package ch08_interface.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스를 객체화 할 수 없다.
		// RemoteControl rc = new RemoteControl();

		RemoteControl rc;
		//rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
	}
}