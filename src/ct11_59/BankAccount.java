package ct11_59;

public class BankAccount {

	//このクラスには、口座番号、口座残高、そしてfinalで定義された銀行コードを含めてください。
	static String accountNum;
	
	static long accountBalance;
	
	static final String accountCd = "101";
	
	static int accounts = 0;
	
	static void details() {
		//銀行コード: 101 口座番号: 123456789, 残高: 10000円 全口座数: 1
		//System.out.println("銀行コード: "+ accountCd + " 口座番号: "+ accountNum + ", 残高: "+ accountBalance +"全口座数: "+String.valueOf(accounts));
		accounts+=1;
		System.out.println("銀行コード: "+ accountCd + " 口座番号: "+ accountNum + ", 残高: "+ accountBalance +"円 全口座数: "+accounts);
	}
}
