package ct08_49;

/**
 * 自動車とトラックを表現するクラスを作成してください。
 * Carクラスを作成します。このクラスには、speed（速度）というint型のフィールドがあります。
 * Carクラスには、速度を設定するsetSpeedメソッドと、現在の速度を表示するshowSpeedメソッドがあります。
 * TruckクラスをCarクラスから派生させ、追加のフィールドloadCapacity（積載量）を持たせます。
 * Truckクラスには、積載量を設定するsetLoadCapacityメソッドと、積載量を表示するshowLoadCapacityメソッドを追加します。
 * 入力
 * 
 * Truck truck = new Truck(); truck.setSpeed(50); truck.setLoadCapacity(5000);
 * 出力:
 * Truckクラスのインスタンスを作成し、速度と積載量を設定した後、これらの値を表示します。
 * Speed: 50
 * Load Capacity: 5000
 */
public class Sample49 {

	public static void main(String[] args) {

		Truck truck = new Truck();
		truck.setSpeed(50);
		truck.setLoadCapacity(5000);
		truck.showSpeed();
		truck.showLoadCapacity();
		
		
	}

}
