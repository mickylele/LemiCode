package ct06;

/**
 * 2つの整数の最大公約数を計算するメソッドgcdを作成してください。このメソッドは再帰を使用せず、ループを通じて最大公約数を計算してください。 入力:
 * 2つの整数（例: 8, 12） 出力: 最大公約数（例: 4） 例: 入力: 18, 24 出力: 6
 */

public class Sample34 {

	public void gcd(int number1, int number2) {

		// 最大公約数1
		int a = number1;
		// 最大公約数2
		int b = number2;

		// 最大公約数を求める
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		// 最大公約数の出力
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		// クラス対象の声明
		Sample34 smp34 = new Sample34();
		// クラス対象を通じてクラス内の最大公約数を計算するメソッドを呼び出す
		smp34.gcd(18, 24);

	}

}
