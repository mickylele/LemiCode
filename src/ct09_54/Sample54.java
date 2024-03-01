package ct09_54;

/**
 * 「計算」の基底インターフェースを作成し、その中にcalculateメソッドを定義します。
 * このインターフェースを実装する派生クラス「加算」、「減算」、「乗算」、「除算」を作成し、それぞれのクラスで異なる計算方法を実装してください。
 * メインクラスでは、これらの計算クラスのインスタンスを使用して具体的な計算を行います。
 * 入力:
 * 二つの数値。
 * 出力:
 * 指定された計算方法による結果。
 * 例:
 * 加算: 5 + 3 = 8 減算: 5 - 3 = 2 乗算: 5 * 3 = 15 除算: 6 / 3 = 2
 */
public class Sample54 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sum sum = new Sum();
		sum.calculate(5, 3);
		Division division = new Division();
		division.calculate(5, 3);
		Multiplication multiplication = new Multiplication();
		multiplication.calculate(5, 3);
		Subtraction subtraction = new Subtraction();
		subtraction.calculate(6, 3);

	}

}
