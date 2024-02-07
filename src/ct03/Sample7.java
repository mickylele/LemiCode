package ct03;

import java.util.Scanner;

/**
 * 整数型の変数が与えられた場合、その数が奇数か偶数かを判定するJavaプログラムを書いてください。
 * 入力:
 * 整数型の値。
 * 出力:
 * 与えられた数が奇数なら奇数、偶数なら偶数と出力します。
 * 例:
 * 入力例: 4
 * 出力例: 偶数
 */

public class Sample7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num % 2 == 0) {
			System.out.println("偶数");
		} else {
			System.out.println("奇数");
		}
		scanner.close();
	}

}
