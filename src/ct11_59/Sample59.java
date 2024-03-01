package ct11_59;

/**
 * 「銀行口座」クラスを作成し、staticおよびfinalキーワードを使用してください。
 * このクラスには、口座番号、口座残高、そしてfinalで定義された銀行コードを含めてください。
 * また、全ての口座の数を追跡するstatic変数と、口座の詳細を表示するstaticメソッドも追加してください。
 * 口座を作成するたびに、口座数を増やすようにします。
 * 入力:
 * プログラムは特定の入力を必要としません。
 * 出力:
 * 各口座の詳細と全口座数を出力します。
 * 例:
 * 銀行コード: 101 口座番号: 123456789, 残高: 10000円 全口座数: 1
 */
public class Sample59 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//BankAccount bankAccount = new BankAccount();
		BankAccount.accountNum = "123456789";
		BankAccount.accountBalance = 10000;
		BankAccount.details();
		BankAccount.accountNum = "333";
		BankAccount.accountBalance = 22;
		BankAccount.details();

	}

}
