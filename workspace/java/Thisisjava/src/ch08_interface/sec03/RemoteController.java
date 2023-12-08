package ch08_interface.sec03;

public class RemoteController implements RemoteControl {
    public void volume() {
        System.out.println("[RemoteController]");
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최저 볼륨: " + RemoteControl.MIN_VOLUME);
        System.out.println("리모콘 중간 볼륨: " + RemoteControl.MID_VOLUME);
    }
}
