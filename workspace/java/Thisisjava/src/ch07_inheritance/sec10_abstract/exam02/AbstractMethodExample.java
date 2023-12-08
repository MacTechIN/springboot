package ch07_inheritance.sec10_abstract.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		//매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Horse());
	}

	public static void animalSound( Animal animal ) {
		animal.sound();
	}
}