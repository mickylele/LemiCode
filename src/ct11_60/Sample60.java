package ct11_60;

/**
 * 「自動車」クラスを作成し、staticおよびfinalキーワードを使用してください。
 * このクラスには、車両のモデル名、レンタル料金、そしてfinalで定義された基本料金（例えば、一日あたりの料金）を含めてください。
 * また、全てのレンタル車両の総数を追跡するstatic変数と、特定の自動車のレンタル料金を計算するstaticメソッドも追加してください。
 * レンタル料金は、基本料金にレンタル日数を乗算して計算します。
 * 入力:
 * レンタル日数。
 * 出力:
 * 自動車のモデル、レンタル日数、および合計レンタル料金。
 * 例:
 * モデル: Toyota Corolla レンタル日数: 3日
 * 合計レンタル料金: 9000円 全車両数: 1
 */
public class Sample60 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Truck.model = "Toyota Corolla";
		Truck.rentalDays = 3;
		Truck.carCount = 1; 
		Truck.details();
		
		Truck.model = "test";
		Truck.rentalDays = 4;
		Truck.carCount = 3; 
		Truck.details();
	}

}
