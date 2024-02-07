package ct01;

import java.util.Scanner;

/**
 * 体重指数は体重（kg）を身長（m）の平方で割ったものです。この指数に基づき、体型を判定するJavaプログラムを書いてください。
 * 体重指数が18.5未満の場合は「やせ型」、18.5以上20.9未満の場合は「スリム」、
 * 20.9以上24.9以下の場合は「標準」、24.9を超える場合は「肥満気味」と判定してください。 入力: 身長（m）と体重（kg）。 出力:
 * 体重指数に基づくユーザーの体型状態。 例: 入力例: 身長 1.75m、体重 65kg 出力例: 標準
 */
public class Sample13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		double high = scanner1.nextDouble();
		double weight = scanner2.nextDouble();
		double bmi = weight / (high * high);
		if (bmi < 18.5) {
			System.out.println("やせ型");
		} else if (bmi >= 18.5 && bmi < 20.9) {
			System.out.println("スリム");
		} else if (bmi >= 20.9 && bmi < 24.9) {
			System.out.println("標準");
		} else {
			System.out.println("肥満気味");
		}
		scanner1.close();
		scanner2.close();

	}

}
