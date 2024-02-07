package ct01;

import java.util.Scanner;

/**
 * コンソールから整数を入力してもらい、ユーザーが非正数（0または負の数）を入力した時点で入力を停止します。
 * このプログラムはユーザーが入力した正の整数の個数をカウントし、その数を出力してください。
 * 入力される数の数は2147483647を超えないと仮定します。
 * 入力:
 * 空白で区切られた複数の整数。
 * 出力:
 * 入力された正の整数の個数。
 * 例:
 * 入力: 5 9 22 3 8 0
 * 出力: 5
 */
public class Sample15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			int num = scanner.nextInt();
			if (num <= 0) {
				break;
			} else {
				count++;
			}
			
		}System.out.println(count);
		scanner.close();

	}

}
