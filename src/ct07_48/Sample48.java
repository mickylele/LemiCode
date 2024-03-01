package ct07_48;

/**
 * 銀行口座（BankAccount）クラスを設計してください。
 * このクラスには、口座番号（accountNumber）、口座名義人（accountHolder）、口座残高（balance）という3つのプライベート属性が必要です。
 * カプセル化の原則に従い、これらの属性に安全にアクセスするための公開メソッド（ゲッターとセッター）を実装し、さらに預金（deposit）と引き出し（withdraw）の機能も追加してください。
 * 引き出しメソッドでは、残高が引き出し額より少ない場合は引き出しを拒否するようにしてください。
 * 入力:
 * BankAccount myAccount = new BankAccount("12345678", "山田太郎", 10000);
 * myAccount.deposit(5000); myAccount.withdraw(4000); 出力:
 * 口座残高: 11000円
 */

public class Sample48 {

	public static void main(String[] args) {

		BankAccount myAccount = new BankAccount("12345678", "山田太郎", 10000);
		
		myAccount.deposit(5000);
		
		myAccount.withdraw(2000);
		
	}

}
