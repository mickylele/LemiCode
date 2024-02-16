package ct06;

import java.util.Arrays;

/**
 * 整数の2次元配列（マトリックス）を受け取り、その転置（行と列を入れ替えること）を行い、新しいマトリックスとして返すメソッドtransposeMatrixを作成してください。
 * mainメソッドでこのメソッドを呼び出し、結果をコンソールに出力してください。 入力: 2次元整数配列（マトリックス）（例: {{1, 2, 3},
 * {4, 5, 6}}） 出力: 転置されたマトリックス（例: {{1, 4}, {2, 5}, {3, 6}}） 例: 入力: {{1, 2}, {3,
 * 4}, {5, 6}} 出力: {{1, 3, 5}, {2, 4, 6}}
 */
public class Sample45 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] transposedArray = transposedArray(array);
		for (int[] row : transposedArray) {
			System.out.println(Arrays.toString(row));
		}

	}

	public static int[][] transposedArray(int[][] array) {
		int rows = array.length;
		int column = array[0].length;
		int[][] transposed = new int[rows][column];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				transposed[j][i] = array[i][j];
			}
		}
		return transposed;

	}

}
