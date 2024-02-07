package ct04;

import java.util.Scanner;

/**
 * キーボードから入力された整数の桁数を計算して出力するプログラムを書いてください。 入力された整数が0以下の場合は、その数自体を出力します。 入力:
 * 一つの整数。 出力: 入力された整数の桁数、または0以下の場合は入力された整数そのもの。 例1: 入力: 12345 出力: 5 例2: 入力: -123
 * 出力: -123
 */

public class Sample21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String str = "";
		int l = 0;
		if (number < 0) {
			System.out.println(number);

		} else {
			// System.out.println(String.valueOf(number).length());
			str = String.valueOf(number);
			l = str.length();
			System.out.println(l);
		}
		scanner.close();

	}

}
