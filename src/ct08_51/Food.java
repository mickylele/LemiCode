package ct08_51;

public class Food extends Product {
	
	String expirationDate;
	
	public Food(String name, int price,String expirationDate) {
		super(name, price);
		this.expirationDate = expirationDate;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void display() {
		
		super.display();
		System.out.println("賞味期限: "+expirationDate);
	}

}
