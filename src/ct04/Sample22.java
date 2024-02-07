package ct04;

import java.util.Scanner;

/**
 * ユーザーが入力した非負整数nの階乗を計算してください。 階乗とは、 1からその数までの全ての整数の積のことを指します。例えば、5の階乗は1 * 2 * 3
 * * 4 * 5 = 120です。 この問題では、forループとi--を使って階乗を計算する必要があります。 入力: ユーザーから入力される非負整数n。
 * 出力: 入力された数nの階乗 例: 入力: 5 出力: 120
 */

public class Sample22 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		long count = 1;
		for (int i = number; i > 0; i--) {
			count *= i;
		}
		System.out.println(count);
		scanner.close();

	}

}
