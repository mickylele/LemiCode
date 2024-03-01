package ct12;

/**
 * 「文字列トリミング」クラスを作成し、与えられた文字列の先頭と末尾の空白を削除する機能を含めてください。
 * このクラスには、文字列の空白を削除するメソッドを含めてください。
 * 入力された文字列を受け取り、トリミングした結果を出力します。
 * 入力:
 * 空白を含む任意の文字列。
 * 出力:
 * トリミング後の文字列。
 * 例:
 * 入力: " こんにちは、LemiCodeさん！ "
 * 出力: "こんにちは、LemiCodeさん！"
 */
public class Sample69 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String sentence = " こんにちは、LemiCodeさん！ ";
		String trimming = sentence.trim();
		
	System.out.println(trimming);
	}

}
