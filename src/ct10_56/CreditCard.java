package ct10_56;

public class CreditCard extends PaymentMethods implements AuthenticationPossible {

	@Override
	public void authenticationPossible() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("オンライン認証成功");
	}

	@Override
	void paymentMethod() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("支払い方法: " + paymentName);
	}

}
