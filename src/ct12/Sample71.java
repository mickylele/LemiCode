package ct12;

/**
 * 「文字列長さ計算」クラスを作成し、与えられた文字列の長さ（すなわち、文字の数）を計算する機能を含めてください。
 * このクラスには、文字列の長さを計算して出力するメソッドを含めてください。メソッドは、与えられた文字列の長さを出力します。
 * 入力:
 * 任意の文字列。
 * 出力:
 * 文字列の長さ（文字の数）。
 * 例:
 * 入力: "こんにちは"
 * 出力: 長さ: 5
 */
public class Sample71 {

	public static void main(String[] args) {

		String words = "こんにちは";
		
		int len = words.length();
		
		System.out.println("長さ: "+ len);
	}

}
