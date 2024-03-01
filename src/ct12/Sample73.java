package ct12;
/**
 * 「最長単語探索」クラスを作成し、与えられた文に含まれる最長の単語を探す機能を含めてください。
 * このクラスには、文字列を単語に分割し、最長の単語を見つけて出力するメソッドを含めてください。
 * 空白文字で単語を区切り、最長の単語を探します。
入力:
任意の文。
出力:
文内の最長単語。
例:
入力: "Javaは面白くて、学ぶのが楽しいプログラミング言語です"
出力: "プログラミング言語です"
 */
public class Sample73 {

	public static void main(String[] args) {

		String sentence = "Javaは面白くて、学ぶのが楽しいプログラミング言語です";
		
		String longestWord = findLongestWord(sentence);
		
		System.out.println(longestWord);
		
	}

	private static String findLongestWord(String sentence) {
		// TODO 自動生成されたメソッド・スタブ
		String[] words = sentence.split(sentence);
		
		String longestWord = "";
		
		for(String word:words) {
			
			if(word.length()>longestWord.length()) {
				
				longestWord = word;
			}
		}
		return longestWord;
	}

}
