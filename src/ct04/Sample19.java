package ct04;

import java.util.Scanner;

/**
 * キーボードから入力された一連の整数の中で、負の数が入力されたら入力を停止し、 それまでに入力された偶数の合計を計算して出力するプログラムを書いてください。
 * 入力: 整数（負の数で終了）。 出力: 入力された偶数の合計。 例: 入力: 4 7 2 -1 出力: 6
 */
public class Sample19 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while (true) {
			int number = scanner.nextInt();
			if (number < 0) {
				break;

			} else {
				if (number % 2 == 0) {
					sum += number;
				}

			}
		}
		System.out.println(sum);
		scanner.close();
	}

}
