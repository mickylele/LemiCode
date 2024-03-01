package ct12;

/**
 * 与えられた住所の文字列を市区町村、通り、番地に分割し、それぞれを出力するプログラムを作成します。 住所はコンマで区切られ、「市区町村,
 * 通り,番地」の形式で与えられます。 入力: 完全な住所の文字列。 出力: 分割された市区町村、通り、番地。 例: 入力: "渋谷区, 明治通り,
 * 1-2-3" 出力: 市区町村: 渋谷区 通り: 明治通り 番地: 1-2-3
 */
public class Sample61 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String fullAddress = "渋谷区, 明治通り, 1-2-3";

		String[] parts = fullAddress.split(",");

		System.out.println("市区町村: " + parts[0]);
		System.out.println("通り:  " + parts[1]);
		System.out.println("番地:  " + parts[2]);
	}

}
