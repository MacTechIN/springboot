package ch08_interface.sec04;

public interface RemoteControl {
	//상수 필드 : public static final 생략
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상 메소드 : public abstract 생략 가능
	public abstract void turnOn();

	// public 생략
	abstract void turnOff();

	// public abstract 생략
	void setVolume(int volume);
}