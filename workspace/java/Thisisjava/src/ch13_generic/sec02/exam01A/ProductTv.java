package ch13_generic.sec02.exam01A;

//제네릭 타입
public class ProductTv {
	//필드
	private Tv kind;
	private String model;
	
	//메소드
	public Tv getKind() { return this.kind; }
	public String getModel() { return this.model; }
	public void setKind(Tv kind) { this.kind = kind; }
	public void setModel(String model) { this.model = model; }
}