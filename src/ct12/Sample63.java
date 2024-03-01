package ct12;

/**
 * 「メールアドレス処理」クラスを作成し、与えられたメールアドレスからドメイン名を抽出する機能を含めてください。
 * メールアドレスは「ユーザー名@ドメイン名」の形式で与えられます。ドメイン名を抽出し、それを出力するメソッドを含めてください。
 * 入力:
 * 完全なメールアドレスの文字列。
 * 出力:
 * 抽出されたドメイン名。
 * 例:
 * 入力: "tanaka@example.com"
 * 出力: "example.com"
 */
public class Sample63 {

	public static void main(String[] args) {

		String email = "tanaka@example.com";
		
		int atIndex = email.indexOf('@');
		
		String domain = email.substring(atIndex+1);
		
		System.out.println("出力: "+ domain);
	}

}
