package ct10_57;
/**
 * 「スマートデバイス」の抽象クラスと、インターフェース「コントロール可能」を作成します。
 * 抽象クラス「スマートデバイス」には、デバイス名を格納する属性と、デバイス情報を出力する抽象メソッドを含めてください。
 * インターフェース「コントロール可能」には、デバイスをオンまたはオフにするメソッドを定義します。
 * 派生クラス「スマートライト」、「スマートサーモスタット」を作成し、これらのクラスで「スマートデバイス」の抽象メソッドを実装し、「コントロール可能」インターフェースのメソッドをオーバーライドしてください。
 * 入力:
 * プログラムは特定の入力を必要としません。
 * 出力:
 * スマートデバイスの情報と、オン/オフの状態を出力します。
 * 例:
 * デバイス: スマートライト ライトをオンにしました。 デバイス: スマートサーモスタット サーモスタットをオフにしました。
 */
public class Sample57 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Smartlight smartlight = new Smartlight();
		smartlight.deviceName = "スマートライト";
		smartlight.displayInfo();
		smartlight.turnOn();
		smartlight.deviceName = "スマートサーモスタット";
		smartlight.displayInfo();
		smartlight.turnOff();

	}

}
