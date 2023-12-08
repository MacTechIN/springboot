package ch07_inheritance.sec02A;

public class SmartPhone {
	//필드 선언
	Phone phone = new Phone();
	public boolean wifi;

	//생성자 선언
	public SmartPhone(String model, String color) {
		this.phone.model = model;
		this.phone.color = color;
	}

	// Phone Getter
	public String model() {
		return this.phone.model();
	}

	public String color() {
		return this.phone.color();
	}

	// Phone Method
	public void bell() {
		this.phone.bell();
	}

	public void sendVoice(String message) {
		this.phone.sendVoice(message);
	}

	public void receiveVoice(String message) {
		this.phone.receiveVoice(message);
	}

	public void hangUp() {
		this.phone.hangUp();
	}

	//메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}

	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}