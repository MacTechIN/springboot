package ch06_class.sec03_class;

public class SportsCarMain {

    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        Tire tire = new Tire();
        SportsCarMain mx = new SportsCarMain();

        System.out.println("car:" + car.toString());
        System.out.println("tire:" + tire.toString());
        System.out.println("mx:" + mx.toString());
    }

}
