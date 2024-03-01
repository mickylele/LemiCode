package ct09_53;

/**
 * 基底クラス「交通手段」を作成し、その派生クラスとして「自動車」と「自転車」を定義します。
 * 基底クラスには、move()という抽象メソッドを持ち、各派生クラスでこのメソッドを異なる方法で実装してください。
 * move()メソッドは、その交通手段の移動方法を示すメッセージを出力するものとします。
 * 入力:
 * プログラムは特定の入力を必要としません。
 * 出力:
 * 各交通手段の移動方法を示すメッセージを出力します。
 * 例:
 * 自動車は道路を走ります。 自転車はサイクリングパスを走ります。
 */
public class Sample53 {

	public static void main(String[] args) {

		Modeoftransportation[] modeoftransportation = new Modeoftransportation[2];
		
		modeoftransportation[0] = new Car();
		modeoftransportation[1] = new Bicycle();
		 
		for(Modeoftransportation modeoftransportation1 : modeoftransportation) {
			modeoftransportation1.move();
			
		}
	}

}
