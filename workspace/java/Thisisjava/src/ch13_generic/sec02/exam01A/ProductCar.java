package ch13_generic.sec02.exam01A;

//제네릭 타입
public class ProductCar {
	//필드
	private Car kind;
	private String model;
	
	//메소드
	public Car getKind() { return this.kind; }
	public String getModel() { return this.model; }
	public void setKind(Car kind) { this.kind = kind; }
	public void setModel(String model) { this.model = model; }
}