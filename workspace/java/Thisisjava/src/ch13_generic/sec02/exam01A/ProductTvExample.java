package ch13_generic.sec02.exam01A;

public class ProductTvExample {
	public static void main(String[] args) {

		ProductTv product = new ProductTv();
			
		//Setter 매개값은 반드시 Car와 String을 제공
		product.setKind(new Tv());
		product.setModel("LG SmartTV");
		
		//Getter 리턴값은 Car와 String이 됨
		Tv tv = product.getKind();
		String carModel = product.getModel();
	}
}