package ch13_generic.sec02.exam01A;

public class ProductCarExample {
	public static void main(String[] args) {

		ProductCar product = new ProductCar();
			
		//Setter 매개값은 반드시 Car와 String을 제공
		product.setKind(new Car());
		product.setModel("SUV자동차");
		
		//Getter 리턴값은 Car와 String이 됨
		Car car = product.getKind();
		String carModel = product.getModel();
	}
}