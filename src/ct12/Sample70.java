package ct12;

/**
 * 「文字列結合」クラスを作成し、与えられた複数の文字列を一つの文字列に結合する機能を含めてください。
 * このクラスには、複数の文字列を受け取り、それらを一つの文字列に結合するメソッドを含めてください。
 * メソッドは、与えられた文字列を順番に結合して、結合後の結果を出力します。
 * 入力:
 * 複数の文字列。
 * 出力:
 * 結合された一つの文字列。
 * 例:
 * 入力: ["Java", "は", "楽しい"]
 * 出力: "Javaは楽しい"
 */
public class Sample70 {

	public static void main(String[] args) {

		String[] sentence = {"Java", "は", "楽しい"};
		
		StringBuilder combined = new StringBuilder();
		for (String sentence1 : sentence) {
            combined.append(sentence1);
           
        }
		
		 System.out.println("結合された文字列: " + combined.toString());
	}

}
