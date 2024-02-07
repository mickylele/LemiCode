package ct01;

import java.util.Scanner;

/**
 * 100以下の二つの正整数に対して、その最小公倍数を計算し、結果を出力するプログラムを作成してください。
 * 入力:
 * 二つのint型変数（プログラム内で直接定義）。
 * 出力:
 * 二つの数の最小公倍数。
 * 例:
 * 入力: 15、20（プログラム内での直接定義） 出力: 60
 */
public class Sample16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int a = scanner1.nextInt();
		int b = scanner2.nextInt();
		int OA = a;
		int OB = b;
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}
		int lcm = (OA * OB) / a;
		System.out.println(lcm);

	}

}
