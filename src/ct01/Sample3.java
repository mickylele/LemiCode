package ct01;

/**
 * double 型の変数を int 型に変換するプログラムを作成してください。変換時には小数点以下を切り捨てます。
 * 
 * 入力:
 * 
 * ランダムな double 型の変数
 * 
 * 出力:
 * 
 * 変換後の int 型の変数
 * 
 * 例1:
 * 
 * 入力: 12.34 出力: 12
 * 
 * 例2:
 * 
 * 入力: 1.88 出力: 1
 * 
 */

public class Sample3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double number1 = 12.34;
		int convertedNumber1 = (int) number1;
		System.out.println("入力" + number1 + "出力" + convertedNumber1);

		double number2 = 1.88;
		int convertedNumber2 = (int) number2;
		System.out.println("入力" + number2 + "出力" + convertedNumber2);

	}

}
