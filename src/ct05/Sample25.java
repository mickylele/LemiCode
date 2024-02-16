package ct05;

/**
 * main メソッド内で、二次元配列の要素の合計を計算してください。二次元配列はハードコーディングされているものとします。
 * 入力:
 * 特に入力はありません。二次元配列はコード内に直接定義されています。
 * 出力:
 * 二次元配列の要素の合計値を出力してください。
 * 例:
 * 入力配列: {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
 * 出力: 45
 */

public class Sample25 {

	public static void main(String[] args) {
		int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];

			}
		}
		System.out.println("二次元配列の要素の合計: " + sum);

	}

}
