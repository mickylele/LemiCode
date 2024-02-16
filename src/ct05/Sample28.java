package ct05;

import java.util.ArrayList;
import java.util.List;

/**
 * 整数の配列が与えられた場合に、その配列内に重複する要素を検出し、それぞれの重複要素を一度だけ出力してください。
 * 配列はハードコーディングされているものとします。 入力: 特に入力はありません。配列はコード内に直接定義されています。 出力:
 * 配列内に存在する重複する各要素を一度ずつ出力してください。 例:
 * 
 * 入力配列: {1, 2, 3, 2, 4, 5, 1, 6} 出力: 1 2 (1 と 2 が重複)
 */

public class Sample28 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 整数の配列の定義
		int[] array = new int[] { 1, 2, 3, 2, 4, 5, 1, 6 };
		// 重複要素list対象の声明
		List<String> list = new ArrayList<>();
		// その配列内に重複する要素を検出し
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					list.add(String.valueOf(array[j]));
				}
			}
		}
		// 配列内に存在する重複する各要素を一度ずつ出力
		for (String s : list) {
			System.out.println(s);
		}

	}

}
