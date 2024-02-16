package ct06;

/**
 * 与えられた文字列の中で特定の文字が何回出現するかを数えるメソッドcountCharacterを作成してください。
 * 入力: 文字列と文字（例: "hello
 * world", 'l'） 出力: 文字の出現回数（例: 3） 例: 入力: "java programming", 'a' 出力: 3
 */

public class Sample43 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String inputString = "java programming";
		char objectChar = 'a';
		int count = countCharacter(inputString, objectChar);
		System.out.println(count);

	}

	public static int countCharacter(String word, char object) {

		int count = 0;
		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == object) {
				count++;

			}

		}
		return count;
	}

}
