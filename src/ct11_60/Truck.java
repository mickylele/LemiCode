package ct11_60;

public class Truck {
 //車両のモデル名、レンタル料金、そしてfinalで定義された基本料金（例えば、一日あたりの料金）を含めてください。
	static String model;
	static long rentalFee;
	static final long baseFee = 3000;
	static int rentalDays;
	static int carCount = 0;
	static void details() {
		//モデル: Toyota Corolla レンタル日数: 3日 合計レンタル料金: 9000円 全車両数: 1;
		rentalFee = baseFee*carCount*rentalDays;
		System.out.println("モデル: "+ model + " レンタル日数: "+ rentalDays + " 合計レンタル料金: "+ rentalFee +"円　 全車両数: "+carCount);
	}
	
}
