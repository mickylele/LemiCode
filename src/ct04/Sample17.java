package ct04;

import java.util.Scanner;

/**
 * キーボードから任意の数の10000以下の正整数を入力し、負の数が入力されたときに入力を終了し、
 * それまでに入力された正整数の平均値を計算して出力するプログラムを書いてください。
 * 平均値はdouble型で計算し、小数点以下2桁で出力します。
 * 入力:
 * 任意の数の正整数（負の数で終了）。
 * 出力:
 * 入力された正整数の平均値（小数点以下2桁で出力）。
 * 例:
 * 入力: 10 20 30 -1 出力: 20.00
 */
public class Sample17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		double avg = 0.00;
		while (true) {
			int num = scanner.nextInt();
			if (num < 0) {
				avg = (double) sum / count;
				break;
			} else {
				sum += num;
				count++;
			}

		}
		System.out.printf("%.2f", avg);

	}

}
