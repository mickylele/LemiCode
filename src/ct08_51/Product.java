package ct08_51;

public class Product {
	
	String name;
	int price;
	
	public Product(String name,int price) {
		this.name=name;
		this.price=price;
	}
	 
	public void display() {
		
		System.out.println("商品名:" +name+"価格:" +price+"円");
		
	}
}


