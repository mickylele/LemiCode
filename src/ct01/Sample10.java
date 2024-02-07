package ct01;

import java.util.Scanner;

/**
 * 成績等級にはA、B、C、Dの4つがあり、それぞれ「優」、「良」、「合格」、「不合格」を意味します。
 * ユーザーが成績等級に対応するを入力した場合、それに応じた評価を出力するプログラムを書いてください。
 * 入力が誤っている場合は「**_**」を出力してください。
 * 入力:
 * 成績等級
 * 出力:
 * 「優」、「良」、「合格」、「不合格」、または「**_**」。
 * 例:
 * 入力: A
 * 出力: 優
 */
public class Sample10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.nextLine();
		switch (grade) {
		case "A":
			System.out.println("優");
			break;
		case "B":
			System.out.println("良");
			break;
		case "C":
			System.out.println("合格");
			break;
		case "D":
			System.out.println("不合格");
			break;
		default:
			System.out.println("**_**");

		}
		scanner.close();

	}

}
