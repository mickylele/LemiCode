package ct06;

/**
 * 整数の配列のすべての要素の合計を計算するメソッドsumArrayを作成してください。 入力: 整数の配列（例: [1, 2, 3, 4, 5]） 出力:
 * 合計値（例: 15） 例: 入力: [6, 7, 8] 出力: 21
 */
public class Sample35 {

	public static void main(String[] args) {
		// 入力の整数の配列定義
		int[] array1 = new int[] { 1, 2, 3, 4, 5 };
		// 入力の整数の配列定義
		int[] array2 = new int[] { 6, 7, 8 };
		// 出力合計値の変数の初期化
		int sum1 = 0;
		// 出力合計値の変数の初期化
		int sum2 = 0;

		// クラス対象の声明
		Sample35 smp35 = new Sample35();
		// クラス対象を通じてクラス内の合計変数を計算するメソッドを呼び出す
		sum1 = smp35.sumArray(array1);

		// クラス対象を通じてクラス内の合計変数を計算するメソッドを呼び出す
		sum2 = smp35.sumArray(array2);

		// 合計値の出力
		System.out.println(sum1);
		System.out.println(sum2);

	}

	public int sumArray(int[] array) {

		// 合計変数の声明
		int sum = 0;

		// 合計変数を求める
		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}

		return sum;

	}

}
