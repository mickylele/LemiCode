package ct08_51;

public class Electronics extends Product{
	
	String maker;
	
	public Electronics(String name, int price,String maker) {
		super(name, price);
		this.maker = maker;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public void display() {
		
		super.display();
		System.out.println("製造元:" +maker);
		
		
	}


	

	
}
