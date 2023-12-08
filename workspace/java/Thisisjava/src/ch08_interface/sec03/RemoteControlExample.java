package ch08_interface.sec03;

import java.rmi.Remote;

public class RemoteControlExample {
	public static void main(String[] args) {
		 System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
		 System.out.println("리모콘 최저 볼륨: " + RemoteControl.MIN_VOLUME);
		 System.out.println("리모콘 중간 볼륨: " + RemoteControl.MID_VOLUME);

		RemoteController rc = new RemoteController();
		rc.volume();
	}
}