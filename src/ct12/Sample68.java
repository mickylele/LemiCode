package ct12;

/**
 * 「文字列変換」クラスを作成し、与えられた文字列の全ての文字を大文字または小文字に変換する機能を含めてください。
 * このクラスには、文字列を大文字に変換するメソッドと小文字に変換するメソッドを含めてください。
 * 入力された文字列を受け取り、大文字に変換した結果と小文字に変換した結果を出力します。
 * 入力:
 * 任意の文字列。
 * 出力:
 * 大文字に変換された文字列と小文字に変換された文字列。
 * 例:
 * 入力: "LemiCode"
 * 大文字変換: "LEMICODE" 小文字変換: "lemicode"
 */
public class Sample68 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String word = "LemiCode";
		
		String lowerCase = word.toLowerCase();
		System.out.println("大文字変換: "+ lowerCase);
		
		String upperCase = word.toUpperCase();
		System.out.println("小文字変換: "+ upperCase);
	}

}
