package ct10_56;

/**
 * 「支払い方法」の抽象クラスと、インターフェース「オンライン認証可能」を作成します。
 * 抽象クラス「支払い方法」には、支払い方法の名称（例えば、クレジットカード、電子マネー）を格納する属性と、支払い処理を行う抽象メソッドを含めてください。
 * インターフェース「オンライン認証可能」には、オンライン認証を行うメソッドを定義します。
 * 派生クラス「クレジットカード」、「電子マネー」を作成し、これらのクラスで「支払い方法」の抽象メソッドを実装し、「オンライン認証可能」インターフェースのメソッドをオーバーライドしてください。
 * 入力:
 * プログラムは特定の入力を必要としません。
 * 出力:
 * 支払い方法とオンライン認証の処理結果を出力します。
 * 例:
 * 支払い方法: クレジットカード オンライン認証成功 支払い方法: 電子マネー オンライン認証成功
 */
public class Sample56 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		CreditCard creditCard = new CreditCard();
		creditCard.paymentName = "クレジットカード";
		creditCard.paymentMethod();
		creditCard.authenticationPossible();
		creditCard.paymentName = "電子マネー";
		creditCard.paymentMethod();
		creditCard.authenticationPossible();

	}

}
