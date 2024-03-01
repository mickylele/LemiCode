package ct12;

/**
 * 「文字列逆順」クラスを作成し、与えられた文字列を逆順にして出力する機能を含めてください。
 * このクラスには、文字列を逆順にするメソッドを含めてください。
 * 入力された文字列を逆順に並べ替えて、その結果を出力します。
 * 入力:
 * 任意の文字列。
 * 出力:
 * 逆順に並べ替えられた文字列。
 * 例:
 * 入力: "こんにちは LemiCode"
 * 出力: "edoCimeL はちにんこ"
 */
public class Sample65 {

	public static void main(String[] args) {

		String sort = "こんにちは LemiCode";
		
		String reversed = new StringBuilder(sort).reverse().toString();
		System.out.println("逆順:" +reversed);
	}

}
