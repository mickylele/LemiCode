package ct12;

/**
 * 「ショッピングリスト」クラスを作成し、複数の商品名を一つの文字列に結合し、特定の商品をリストから置換する機能を含めてください。
 * このクラスには、商品名をコンマで結合するメソッドと、リスト内の特定の商品を別の商品で置換するメソッドを含めてください。 入力:
 * 複数の商品名の配列、置換前の商品名、置換後の商品名。 出力: 結合された商品名のリスト、置換後の商品名のリスト。 例: 入力商品名配列: ["りんご",
 * "バナナ", "トマト"] 置換前の商品名: "バナナ" 置換後の商品名: "いちご" 結合されたリスト: "りんご,バナナ,トマト" 置換後のリスト:
 * "りんご,いちご,トマト"
 */
public class Sample62 {

	public static void main(String[] args) {

		String[] product = { "りんご,バナナ,トマト" };

		String combinedList = String.join(",", product);

		String replaceList = combinedList.replace("バナナ", "いちご");

		System.out.println("置換後のリスト: " + replaceList);

	}

}
