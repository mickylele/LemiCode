package ct03;

import java.util.Scanner;

/**
 * ユーザーが入力した年齢に基づいて人を分類するプログラムを書いてください。
 * 分類は以下の通りです：0～12歳は「子供」、13～19歳は「青少年」、20～59歳は「成人」、60歳以上は「高齢者」とします。 入力:
 * ーザーの年齢（整数）。 出力: 年齢に基づく分類。 例: 入力: 16 出力: 青少年
 */
public class Sample9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();

		if (age <= 12) {
			System.out.println("子供");
		} else if (age <= 19) {
			System.out.println("青少年");
		} else if (age <= 59) {
			System.out.println("成人");

		} else {
			System.out.println("高齢者");
		}
		scanner.close();

	}

}
