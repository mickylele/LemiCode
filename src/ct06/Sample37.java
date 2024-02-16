package ct06;

/**
 * 与えられた整数が素数（1とその数自身以外に正の約数を持たない数）かどうかを判定するメソッドisPrimeを作成してください。 入力: 整数（例: 29）
 * 出力: 素数かどうかの真偽値（例: true） 例: 入力: 31 出力: true
 */

public class Sample37 {
	public static boolean isPrime(int number) {
		if (number <= 1) {

			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int number = 12;
		if (isPrime(number)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}
	}

}
