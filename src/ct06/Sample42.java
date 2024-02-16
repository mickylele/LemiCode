package ct06;

/**
 * 与えられた文字列がパリンドローム（前後から読んでも同じになる文字列）であるかどうかを判定するメソッドisPalindromeを作成してください。 入力:
 * 文字列（例: "racecar"） 出力: パリンドロームかどうかの真偽値（例: true） 例: 入力: "madam" 出力: true
 */

public class Sample42 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println(isPalindrome("madam"));

	}

	public static boolean isPalindrome(String word) {
		int left = 0;
		int right = word.length() - 1;
		while (left < right) {
			if (word.charAt(left) != word.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;

	}
}
